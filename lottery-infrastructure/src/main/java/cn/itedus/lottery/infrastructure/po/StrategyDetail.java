package cn.itedus.lottery.infrastructure.po;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 策略明细
 */
public class StrategyDetail {

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 奖品ID
     */
    private String awardId;

    /**
     * 奖品数量
     */
    private Integer awardCount;

    /**
     * 中奖概率
     */
    private BigDecimal awardRate;

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

    public void setAwardId(String awardId) {
        this.awardId = awardId;
    }

    public String getAwardId() {
        return awardId;
    }

    public void setAwardCount(Integer awardCount) {
        this.awardCount = awardCount;
    }

    public Integer getAwardCount() {
        return awardCount;
    }

    public void setAwardRate(BigDecimal awardRate) {
        this.awardRate = awardRate;
    }

    public BigDecimal getAwardRate() {
        return awardRate;
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
        return "StrategyDetail{" +
                "id=" + id + '\'' +
                "strategyId=" + strategyId + '\'' +
                "awardId=" + awardId + '\'' +
                "awardCount=" + awardCount + '\'' +
                "awardRate=" + awardRate + '\'' +
                "createTime=" + createTime + '\'' +
                "updateTime=" + updateTime + '\'' +
                '}';
    }
}
