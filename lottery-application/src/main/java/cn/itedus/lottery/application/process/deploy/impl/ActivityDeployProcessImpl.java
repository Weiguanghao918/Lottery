package cn.itedus.lottery.application.process.deploy.impl;

import cn.itedus.lottery.application.process.deploy.IActivityDeployProcess;
import cn.itedus.lottery.domain.activity.model.aggregates.ActivityInfoLimitPageRich;
import cn.itedus.lottery.domain.activity.model.req.ActivityInfoLimitPageReq;
import cn.itedus.lottery.domain.activity.service.deploy.IActivityDeploy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Guanghao Wei
 * @date: 2023-06-05 14:35
 * @description: 活动部署编排实现
 */
@Service
public class ActivityDeployProcessImpl implements IActivityDeployProcess {
    @Resource
    private IActivityDeploy activityDeploy;

    @Override
    public ActivityInfoLimitPageRich queryActivityInfoLimitPage(ActivityInfoLimitPageReq req) {
        return activityDeploy.queryActivityInfoLimitPage(req);
    }
}
