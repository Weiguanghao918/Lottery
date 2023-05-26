package cn.itedus.lottery.domain.rule.model.vo;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-26 12:04
 * @description: 规则数线信息
 */
public class TreeNodeLineVO {

    /**
     * 节点From
     */
    private Long nodeIdFrom;
    /**
     * 节点To
     */
    private Long nodeIdTo;
    /**
     * 限定类型；1:=;2:>;3:<;4:>=;5<=;6:enum[枚举范围]
     */
    private Integer ruleLimitType;
    /**
     * 限定值
     */
    private String ruleLimitValue;

    public Long getNodeIdFrom() {
        return nodeIdFrom;
    }

    public void setNodeIdFrom(Long nodeIdFrom) {
        this.nodeIdFrom = nodeIdFrom;
    }

    public Long getNodeIdTo() {
        return nodeIdTo;
    }

    public void setNodeIdTo(Long nodeIdTo) {
        this.nodeIdTo = nodeIdTo;
    }

    public Integer getRuleLimitType() {
        return ruleLimitType;
    }

    public void setRuleLimitType(Integer ruleLimitType) {
        this.ruleLimitType = ruleLimitType;
    }

    public String getRuleLimitValue() {
        return ruleLimitValue;
    }

    public void setRuleLimitValue(String ruleLimitValue) {
        this.ruleLimitValue = ruleLimitValue;
    }

    @Override
    public String toString() {
        return "TreeNodeLineVO{" +
                "nodeIdFrom=" + nodeIdFrom +
                ", nodeIdTo=" + nodeIdTo +
                ", ruleLimitType=" + ruleLimitType +
                ", ruleLimitValue='" + ruleLimitValue + '\'' +
                '}';
    }

}

