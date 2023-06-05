package cn.itedus.lottery.domain.activity.repository;

import cn.itedus.lottery.common.Constants;
import cn.itedus.lottery.domain.activity.model.aggregates.ActivityInfoLimitPageRich;
import cn.itedus.lottery.domain.activity.model.req.ActivityInfoLimitPageReq;
import cn.itedus.lottery.domain.activity.model.req.PartakeReq;
import cn.itedus.lottery.domain.activity.model.res.StockResult;
import cn.itedus.lottery.domain.activity.model.vo.*;

import java.util.List;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-23 13:40
 * @description: 活动仓库服务(活动表 、 奖品表 、 策略表 、 策略明细表)
 */
public interface IActivityRepository {
    /**
     * 添加活动配置
     *
     * @param activity 活动配置
     */
    void addActivity(ActivityVO activity);

    /**
     * 添加奖品配置集合
     *
     * @param awardList 奖品配置集合
     */
    void addAward(List<AwardVO> awardList);

    /**
     * 添加策略配置
     *
     * @param strategy 策略配置
     */
    void addStrategy(StrategyVO strategy);

    /**
     * 添加策略明细配置
     *
     * @param strategyDetailList 策略明细集合
     */
    void addStrategyDerailList(List<StrategyDetailVO> strategyDetailList);

    /**
     * 变更活动状态
     *
     * @param activityId  活动ID
     * @param beforeState 修改前状态
     * @param afterState  修改后状态
     * @return 更新结果
     */

    boolean alterStatus(Long activityId, Enum<Constants.ActivityState> beforeState, Enum<Constants.ActivityState> afterState);

    /**
     * 查询活动账单信息 【库存、状态、日期、个人参与次数】
     *
     * @param req 参与活动请求
     * @return 封装后的活动账单
     */
    ActivityBillVO queryActivityBill(PartakeReq req);

    /**
     * 扣减活动库存
     *
     * @param activityId 活动ID
     * @return 扣减结果
     */
    int subtractionActivityStock(Long activityId);

    /**
     * 扫描待处理的活动列表，状态为：通过、活动中
     *
     * @param id ID
     * @return 待处理的活动集合
     */
    List<ActivityVO> scanToDoActivityList(long id);

    /**
     * 扣减活动库存，通过Redis
     *
     * @param uId        用户ID
     * @param activityId 活动ID
     * @param stockCount 总库存
     * @return 扣减结果
     */
    StockResult subtractionActivityStockByRedis(String uId, Long activityId, Integer stockCount);

    /**
     * 恢复活动库存，通过Redis 【如果非常异常，则需要进行缓存库存恢复，只保证不超卖的特性，所以不保证一定能恢复占用库存，另外最终可以由任务进行补偿库存】
     *
     * @param activityId 活动ID
     * @param tokenKey   分布式 KEY 用于清理
     * @param code       状态
     */
    void recoverActivityCacheStockByRedis(Long activityId, String tokenKey, String code);

    /**
     * 查询活动分页查询聚合对象
     *
     * @param req 请求参数：分页、活动
     * @return 查询结果
     */
    ActivityInfoLimitPageRich queryActivityInfoLimitPage(ActivityInfoLimitPageReq req);
}
