package cn.itedus.lottery.infrastructure.po;

import java.util.Date;

/**
 * 奖品配置
 */
public class Award {

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 奖品ID
     */
    private String awardId;

    /**
     * 奖品类型（文字描述、兑换码、优惠券、实物奖品暂无）
     */
    private Integer awardType;

    /**
     * 奖品数量
     */
    private Integer awardCount;

    /**
     * 奖品名称
     */
    private String awardName;

    /**
     * 奖品内容「文字描述、Key、码」
     */
    private String awardContent;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * updateTime
     */
    private Date updateTime;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setAwardId(String awardId) {
        this.awardId = awardId;
    }

    public String getAwardId() {
        return awardId;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardCount(Integer awardCount) {
        this.awardCount = awardCount;
    }

    public Integer getAwardCount() {
        return awardCount;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardContent(String awardContent) {
        this.awardContent = awardContent;
    }

    public String getAwardContent() {
        return awardContent;
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
        return "Award{" +
                "id=" + id + '\'' +
                "awardId=" + awardId + '\'' +
                "awardType=" + awardType + '\'' +
                "awardCount=" + awardCount + '\'' +
                "awardName=" + awardName + '\'' +
                "awardContent=" + awardContent + '\'' +
                "createTime=" + createTime + '\'' +
                "updateTime=" + updateTime + '\'' +
                '}';
    }
}
