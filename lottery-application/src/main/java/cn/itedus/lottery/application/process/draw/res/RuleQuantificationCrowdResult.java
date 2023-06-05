package cn.itedus.lottery.application.process.draw.res;

import cn.itedus.lottery.common.Result;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-29 10:35
 * @description: 规则引擎量化人群返回结果
 */
public class RuleQuantificationCrowdResult extends Result {

    /** 活动ID */
    private Long activityId;

    public RuleQuantificationCrowdResult(String code, String info) {
        super(code, info);
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

}