package cn.itedus.lottery.infrastructure.po;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-26 13:31
 * @description: 规则树节点
 */
public class RuleTreeNode {

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 规则树ID
     */
    private Long treeId;
    /**
     * 节点类型；1子叶、2果实
     */
    private Integer nodeType;
    /**
     * 节点值[nodeType=2]；果实值
     */
    private String nodeValue;
    /**
     * 规则Key
     */
    private String ruleKey;
    /**
     * 规则描述
     */
    private String ruleDesc;

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

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }

    public String getRuleKey() {
        return ruleKey;
    }

    public void setRuleKey(String ruleKey) {
        this.ruleKey = ruleKey;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }
}
