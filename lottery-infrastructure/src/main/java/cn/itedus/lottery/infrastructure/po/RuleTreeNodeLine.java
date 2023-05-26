package cn.itedus.lottery.infrastructure.po;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-26 13:32
 * @description: 规则树节点连线
 */
public class RuleTreeNodeLine {

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 规则树ID
     */
    private Long treeId;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

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
}
