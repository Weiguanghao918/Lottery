package cn.itedus.lottery.domain.activity.model.vo;

import java.util.Date;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-25 17:33
 * @description: 奖品单
 */
public class DrawOrderVO {

    /**
     * 用户ID
     */
    private String uId;

    /**
     * 活动领取ID
     */
    private Long takeId;
    /**
     * 活动ID
     */
    private Long activityId;
    /**
     * 订单ID
     */
    private Long orderId;
    /**
     * 策略ID
     */
    private Long strategyId;
    /**
     * 策略方式（1:单项概率、2:总体概率）
     */
    private Integer strategyMode;
    /**
     * 发放奖品方式（1:即时、2:定时[含活动结束]、3:人工）
     */
    private Integer grantType;
    /**
     * 发奖时间
     */
    private Date grantDate;
    /**
     * 发奖状态
     */
    private Integer grantState;
    /**
     * 发奖ID
     */
    private String awardId;
    /**
     * 奖品类型（1:文字描述、2:兑换码、3:优惠券、4:实物奖品）
     */
    private Integer awardType;
    /**
     * 奖品名称
     */
    private String awardName;
    /**
     * 奖品内容「文字描述、Key、码」
     */
    private String awardContent;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Long getTakeId() {
        return takeId;
    }

    public void setTakeId(Long takeId) {
        this.takeId = takeId;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public Integer getStrategyMode() {
        return strategyMode;
    }

    public void setStrategyMode(Integer strategyMode) {
        this.strategyMode = strategyMode;
    }

    public Integer getGrantType() {
        return grantType;
    }

    public void setGrantType(Integer grantType) {
        this.grantType = grantType;
    }

    public Date getGrantDate() {
        return grantDate;
    }

    public void setGrantDate(Date grantDate) {
        this.grantDate = grantDate;
    }

    public Integer getGrantState() {
        return grantState;
    }

    public void setGrantState(Integer grantState) {
        this.grantState = grantState;
    }

    public String getAwardId() {
        return awardId;
    }

    public void setAwardId(String awardId) {
        this.awardId = awardId;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getAwardContent() {
        return awardContent;
    }

    public void setAwardContent(String awardContent) {
        this.awardContent = awardContent;
    }

    @Override
    public String toString() {
        return "DrawOrderVO{" +
                "uId='" + uId + '\'' +
                ", takeId=" + takeId +
                ", activityId=" + activityId +
                ", orderId=" + orderId +
                ", strategyId=" + strategyId +
                ", strategyMode=" + strategyMode +
                ", grantType=" + grantType +
                ", grantDate=" + grantDate +
                ", grantState=" + grantState +
                ", awardId='" + awardId + '\'' +
                ", awardType=" + awardType +
                ", awardName='" + awardName + '\'' +
                ", awardContent='" + awardContent + '\'' +
                '}';
    }

}
