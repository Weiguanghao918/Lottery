package cn.itedus.lottery.application.process.draw.req;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-25 17:15
 * @description: 抽奖请求入参
 */
public class DrawProcessReq {

    /**
     * 用户ID
     */
    private String uId;
    /**
     * 活动ID
     */
    private Long activityId;

    public DrawProcessReq() {
    }

    public DrawProcessReq(String uId, Long activityId) {
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
