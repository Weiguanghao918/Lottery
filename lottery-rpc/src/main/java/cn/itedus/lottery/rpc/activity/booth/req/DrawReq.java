package cn.itedus.lottery.rpc.activity.booth.req;

import java.io.Serializable;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-29 10:45
 * @description: 抽奖请求
 */
public class DrawReq implements Serializable {

    /**
     * 用户ID
     */
    private String uId;
    /**
     * 活动ID
     */
    private Long activityId;

    public DrawReq() {
    }

    public DrawReq(String uId, Long activityId) {
        this.uId = uId;
        this.activityId = activityId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
}
