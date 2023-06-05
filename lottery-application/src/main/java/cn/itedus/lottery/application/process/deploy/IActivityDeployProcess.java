package cn.itedus.lottery.application.process.deploy;

import cn.itedus.lottery.domain.activity.model.aggregates.ActivityInfoLimitPageRich;
import cn.itedus.lottery.domain.activity.model.req.ActivityInfoLimitPageReq;

/**
 * @author: Guanghao Wei
 * @date: 2023-06-05 14:33
 * @description: 活动部署接口：查询列表、创建活动、修改活动、删除活动（一般实际场景为逻辑删除），如果活动的部署需要做一些逻辑校验，那么可以在这一层做编排
 */
public interface IActivityDeployProcess {
    /**
     * 查询活动分页查询聚合对象
     *
     * @param req 请求参数：分页、活动
     * @return 查询结果
     */
    ActivityInfoLimitPageRich queryActivityInfoLimitPage(ActivityInfoLimitPageReq req);
}
