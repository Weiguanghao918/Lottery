package cn.itedus.lottery.domain.activity.service.partake.impl;

import cn.itedus.lottery.common.Constants;
import cn.itedus.lottery.common.Result;
import cn.itedus.lottery.domain.activity.model.req.PartakeReq;
import cn.itedus.lottery.domain.activity.model.res.StockResult;
import cn.itedus.lottery.domain.activity.model.vo.*;
import cn.itedus.lottery.domain.activity.repository.IUserTakeActivityRepository;
import cn.itedus.lottery.domain.activity.service.partake.BaseActivityPartake;
import cn.itedus.lottery.domain.support.ids.IdGenerator;
import cn.itedus.middleware.db.router.strategy.IDBRouterStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;


import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-25 13:36
 * @description: 活动参与功能实现
 */
@Service
public class ActivityPartakeImpl extends BaseActivityPartake {

    private Logger logger = LoggerFactory.getLogger(ActivityPartakeImpl.class);

    @Resource
    private IUserTakeActivityRepository userTakeActivityRepository;

    @Resource
    private Map<Enum<Constants.Ids>, IdGenerator> idGeneratorMap;

    @Resource
    private TransactionTemplate transactionTemplate;

    @Resource
    private IDBRouterStrategy dbRouter;


    @Override
    protected void recoverActivityCacheStockByRedis(Long activityId, String tokenKey, String code) {
        activityRepository.recoverActivityCacheStockByRedis(activityId, tokenKey, code);
    }

    @Override
    protected StockResult subtractionActivityStockByRedis(String uId, Long activityId, Integer stockCount, Date endDateTime) {
        return activityRepository.subtractionActivityStockByRedis(uId, activityId, stockCount, endDateTime);
    }

    @Override
    protected UserTakeActivityVO queryNoConsumedTakeActivityOrder(Long activityId, String uId) {
        return userTakeActivityRepository.queryNoConsumedTakeActivityOrder(activityId, uId);
    }

    @Override
    protected Result grabActivity(PartakeReq partake, ActivityBillVO bill, Long takeId) {
        try {
            /**
             * 编程式处理分库分表
             * 注解式事务是依赖于当前数据源的，在这个我们手动切换了数据源，所以需要使用编程式事务控制事务的边界，确保多个操作在一个事务中执行
             * 这样能够有效处理分库分表的情况，精准控制事务的范围和隔离性，并在需要时进行回滚
             * 这里编程式事务还是处理的一个库下面的事务，没有跨库，主要是结合我们切换数据源使用
             */
            dbRouter.doRouter(partake.getuId());
            //编程式事务，用的是自研版分库分表中间件提供的事务对象，通过这样的方式可以更加方便地处理细节的回滚，而不需要抛异常处理。
            return transactionTemplate.execute(status -> {
                try {
                    //扣减个人已参与次数
                    int updateCount = userTakeActivityRepository.subtractionLeftCount(bill.getActivityId(), bill.getActivityName(), bill.getTakeCount(), bill.getUserTakeLeftCount(), partake.getuId(), partake.getPartakeDate());
                    if (0 == updateCount) {
                        status.setRollbackOnly();
                        logger.error("领取活动，扣减个人已参与次数失败，activityId：{}，Uid：{}", partake.getActivityId(), partake.getuId());
                        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "扣减个人已参与次数失败");
                    }

                    //插入领取活动信息
                    userTakeActivityRepository.takeActivity(bill.getActivityId(), bill.getActivityName(), bill.getStrategyId(), bill.getTakeCount(), bill.getUserTakeLeftCount(), partake.getuId(), partake.getPartakeDate(), takeId);
                } catch (DuplicateKeyException e) {
                    status.setRollbackOnly();
                    logger.error("领取活动，唯一索引冲突 activityId：{} uId：{}", partake.getActivityId(), partake.getuId(), e);
                    return Result.buildResult(Constants.ResponseCode.INDEX_DUP, "主键发生冲突");
                }
                return Result.buildSuccessResult();
            });
        } finally {
            dbRouter.clear();
        }
    }

    @Override
    protected Result subtractionActivityStock(PartakeReq req) {
        int count = activityRepository.subtractionActivityStock(req.getActivityId());
        if (0 == count) {
            logger.error("扣减活动库存失败 activityId：{}", req.getActivityId());
            return Result.buildResult(Constants.ResponseCode.UN_ERROR, "扣减活动库存失败");
        }
        return Result.buildSuccessResult();
    }

    @Override
    protected Result checkActivityBill(PartakeReq partake, ActivityBillVO bill) {
        //校验：活动状态
        if (!Constants.ActivityState.DOING.getCode().equals(bill.getState())) {
            logger.warn("活动当前状态非可用 state: {}", bill.getState());
            return Result.buildResult(Constants.ResponseCode.UN_ERROR, "活动当前状态非可用");
        }

        //校验：活动日期
        if (bill.getBeginDateTime().after(partake.getPartakeDate()) || bill.getEndDateTime().before(partake.getPartakeDate())) {
            logger.warn("活动时间范围非可用 beginDataTime：{} endDataTime：{}", bill.getBeginDateTime(), bill.getEndDateTime());
            return Result.buildResult(Constants.ResponseCode.UN_ERROR, "活动时间范围非可用");
        }

        //校验：活动库存
        if (bill.getStockSurplusCount() <= 0) {
            logger.warn("活动剩余库存非可用， stockSurplusCount：{}", bill.getStockSurplusCount());
            return Result.buildResult(Constants.ResponseCode.UN_ERROR, "活动剩余库存非可用");
        }

        //校验：个人库存-个人活动剩余可领取次数
        if (bill.getUserTakeLeftCount() != null) {
            if (bill.getUserTakeLeftCount() <= 0) {
                logger.warn("个人领取次数非可用 userTakeLeftCount：{}", bill.getUserTakeLeftCount());
                return Result.buildResult(Constants.ResponseCode.UN_ERROR, "个人领取次数非可用");
            }
        }

        return Result.buildSuccessResult();
    }

    @Override
    public Result recordDrawOrder(DrawOrderVO drawOrder) {
        try {
            dbRouter.doRouter(drawOrder.getuId());
            return transactionTemplate.execute(status -> {
                try {
                    //锁定活动领取记录
                    int lockCount = userTakeActivityRepository.lockTackActivity(drawOrder.getuId(), drawOrder.getActivityId(), drawOrder.getTakeId());
                    if (0 == lockCount) {
                        status.setRollbackOnly();
                        logger.error("记录中奖单，个人参与活动抽奖已消耗完，activity:{}， uId：{}", drawOrder.getActivityId(), drawOrder.getuId());
                        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "个人参与活动抽奖已消耗完");
                    }

                    //保存抽奖信息
                    userTakeActivityRepository.saveUserStrategyExport(drawOrder);
                } catch (DuplicateKeyException e) {
                    status.setRollbackOnly();
                    logger.error("记录中奖单，唯一索引冲突 activityId：{} uId：{}", drawOrder.getActivityId(), drawOrder.getuId(), e);
                    return Result.buildResult(Constants.ResponseCode.INDEX_DUP, "主键发生冲突");
                }
                return Result.buildSuccessResult();
            });
        } finally {
            dbRouter.clear();
        }

    }

    @Override
    public void updateInvoiceMqState(String uId, Long orderId, Integer mqState) {
        userTakeActivityRepository.updateInvoiceMqState(uId, orderId, mqState);
    }

    @Override
    public List<InvoiceVO> scanInvoiceMqState(int dbCount, int tbCount) {
        try {
            //设置路由
            dbRouter.setDBKey(dbCount);
            dbRouter.setTBKey(tbCount);
            //查询数据
            return userTakeActivityRepository.scanInvoiceMqState();
        } finally {
            dbRouter.clear();
        }
    }

    @Override
    public void updateActivityStock(ActivityPartakeRecordVO activityPartakeRecordVO) {
        userTakeActivityRepository.updateActivityStock(activityPartakeRecordVO);
    }

    @Override
    public Result lockTackActivity(String uId, Long activityId, Long takeId) {
        try {
            dbRouter.doRouter(uId);
            return transactionTemplate.execute(status -> {
                try {
                    //锁定活动领取记录
                    int lockCount = userTakeActivityRepository.lockTackActivity(uId, activityId, takeId);
                    if (0 == lockCount) {
                        status.setRollbackOnly();
                        logger.error("记录未中奖，个人参与活动抽奖已消耗完 activityId：{} uId：{}", activityId, uId);
                        return Result.buildResult(Constants.ResponseCode.NO_UPDATE);
                    }
                } catch (DuplicateKeyException e) {
                    status.setRollbackOnly();
                    logger.error("记录未中奖，唯一索引冲突 activityId：{} uId：{}", activityId, uId, e);
                    return Result.buildResult(Constants.ResponseCode.INDEX_DUP);
                }
                return Result.buildSuccessResult();
            });
        } finally {
            dbRouter.clear();
        }

    }
}
