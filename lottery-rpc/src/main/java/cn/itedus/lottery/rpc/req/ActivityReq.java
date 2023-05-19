package cn.itedus.lottery.rpc.req;

import java.io.Serializable;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-19 15:44
 * @description: 入参req
 */
public class ActivityReq implements Serializable {

    private Long activityId;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

}