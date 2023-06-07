package cn.itedus.lottery.interfaces.facade;

import cn.itedus.lottery.application.process.deploy.IActivityDeployProcess;
import cn.itedus.lottery.common.Result;
import cn.itedus.lottery.domain.activity.model.aggregates.ActivityInfoLimitPageRich;
import cn.itedus.lottery.domain.activity.model.req.ActivityInfoLimitPageReq;
import cn.itedus.lottery.domain.activity.model.vo.ActivityVO;
import cn.itedus.lottery.interfaces.assembler.IMapping;
import cn.itedus.lottery.rpc.activity.deploy.ILotteryActivityDeploy;
import cn.itedus.lottery.rpc.activity.deploy.dto.ActivityDTO;
import cn.itedus.lottery.rpc.activity.deploy.req.ActivityPageReq;
import cn.itedus.lottery.rpc.activity.deploy.res.ActivityRes;
import com.alibaba.fastjson.JSON;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Guanghao Wei
 * @date: 2023-06-05 14:05
 * @description: 抽奖活动部署，给ERP运营后台返回数据
 */
@Service
public class LotteryActivityDeploy implements ILotteryActivityDeploy {

    private Logger logger = LoggerFactory.getLogger(LotteryActivityDeploy.class);

    @Resource
    private IActivityDeployProcess activityDeploy;

    @Resource
    private IMapping<ActivityVO, ActivityDTO> activityMapping;

    @Override
    public ActivityRes queryActivityListByPageForErp(ActivityPageReq req) {
        try {
            logger.info("活动部署分页数据查询开始 erpId；{}", req.getErpId());
            //1. 包装入参
            ActivityInfoLimitPageReq activityInfoLimitPageReq = new ActivityInfoLimitPageReq(req.getPage(), req.getRows());
            activityInfoLimitPageReq.setActivityId(req.getActivityId());
            activityInfoLimitPageReq.setActivityName(req.getActivityName());

            //2. 查询结果
            ActivityInfoLimitPageRich activityInfoLimitPageRich = activityDeploy.queryActivityInfoLimitPage(activityInfoLimitPageReq);
            Long count = activityInfoLimitPageRich.getCount();
            List<ActivityVO> activityVOList = activityInfoLimitPageRich.getActivityVOList();

            //3. 转换对象
            List<ActivityDTO> activityDTOList = activityMapping.sourceToTarget(activityVOList);

            //4. 数据封装
            ActivityRes activityRes = new ActivityRes(Result.buildSuccessResult());
            activityRes.setCount(count);
            activityRes.setActivityDTOList(activityDTOList);

            logger.info("活动部署分页数据查询完成 erpId：{} count: {}", req.getErpId(), count);

            //5. 返回结果
            return activityRes;
        } catch (Exception e) {
            logger.error("活动部署分页数据查询失败 erpID：{} reqStr：{}", req.getErpId(), JSON.toJSON(req), e);
            return new ActivityRes(Result.buildErrorResult());
        }

    }
}
