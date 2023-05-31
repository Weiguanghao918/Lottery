package cn.itedus.lottery.domain.activity.model.vo;

import java.util.Date;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-25 11:10
 * @description: 活动账单[库存、状态、日期、个人参与次数]
 */
public class ActivityBillVO {

    /** 用户ID */
    private String uId;

    /** activity 活动ID */
    private Long activityId;
    /** activity 活动名称 */
    private String activityName;
    /** activity 开始时间 */
    private Date beginDateTime;
    /** activity 结束时间 */
    private Date endDateTime;
    /** 库存 */
    private Integer stockCount;
    /** activity 库存剩余 */
    private Integer stockSurplusCount;
    /**
     * activity 活动状态：1编辑、2提审、3撤审、4通过、5运行(审核通过后worker扫描状态)、6拒绝、7关闭、8开启
     * Constants.ActivityState
     */
    private Integer state;
    /** activity 策略ID */
    private Long strategyId;
    /** activity 每人可参与次数 */
    private Integer takeCount;

    /** user_take_activity_count 已领取次数 */
    private Integer userTakeLeftCount;

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

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Date getBeginDateTime() {
        return beginDateTime;
    }

    public void setBeginDateTime(Date beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Integer getStockSurplusCount() {
        return stockSurplusCount;
    }

    public void setStockSurplusCount(Integer stockSurplusCount) {
        this.stockSurplusCount = stockSurplusCount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public Integer getTakeCount() {
        return takeCount;
    }

    public void setTakeCount(Integer takeCount) {
        this.takeCount = takeCount;
    }

    public Integer getUserTakeLeftCount() {
        return userTakeLeftCount;
    }

    public void setUserTakeLeftCount(Integer userTakeLeftCount) {
        this.userTakeLeftCount = userTakeLeftCount;
    }

    @Override
    public String toString() {
        return "ActivityBillVO{" +
                "uId='" + uId + '\'' +
                ", activityId=" + activityId +
                ", activityName='" + activityName + '\'' +
                ", beginDateTime=" + beginDateTime +
                ", endDateTime=" + endDateTime +
                ", stockCount=" + stockCount +
                ", stockSurplusCount=" + stockSurplusCount +
                ", state=" + state +
                ", strategyId=" + strategyId +
                ", takeCount=" + takeCount +
                ", userTakeLeftCount=" + userTakeLeftCount +
                '}';
    }

}
