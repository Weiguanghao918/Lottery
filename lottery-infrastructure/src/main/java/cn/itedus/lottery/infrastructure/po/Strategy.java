package cn.itedus.lottery.infrastructure.po;

import java.util.Date;

/**
 * 策略配置
 */
public class Strategy {

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 策略描述
     */
    private String strategyDesc;

    /**
     * 策略方式「1:单项概率、2:总体概率」
     */
    private Integer strategyMode;

    /**
     * 发放奖品方式「1:即时、2:定时[含活动结束]、3:人工」
     */
    private Integer grantType;

    /**
     * 发放奖品时间
     */
    private Date grantDate;

    /**
     * 扩展信息
     */
    private String extInfo;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyDesc(String strategyDesc) {
        this.strategyDesc = strategyDesc;
    }

    public String getStrategyDesc() {
        return strategyDesc;
    }

    public void setStrategyMode(Integer strategyMode) {
        this.strategyMode = strategyMode;
    }

    public Integer getStrategyMode() {
        return strategyMode;
    }

    public void setGrantType(Integer grantType) {
        this.grantType = grantType;
    }

    public Integer getGrantType() {
        return grantType;
    }

    public void setGrantDate(Date grantDate) {
        this.grantDate = grantDate;
    }

    public Date getGrantDate() {
        return grantDate;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    @Override
    public String toString() {
        return "Strategy{" +
                "id=" + id + '\'' +
                "strategyId=" + strategyId + '\'' +
                "strategyDesc=" + strategyDesc + '\'' +
                "strategyMode=" + strategyMode + '\'' +
                "grantType=" + grantType + '\'' +
                "grantDate=" + grantDate + '\'' +
                "extInfo=" + extInfo + '\'' +
                "createTime=" + createTime + '\'' +
                "updateTime=" + updateTime + '\'' +
                '}';
    }
}
