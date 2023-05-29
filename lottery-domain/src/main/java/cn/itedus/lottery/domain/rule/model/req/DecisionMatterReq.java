package cn.itedus.lottery.domain.rule.model.req;

import java.util.Map;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-26 12:01
 * @description: 决策物料
 */
public class DecisionMatterReq {

    /**
     * 规则树ID
     */
    private Long treeId;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 决策值
     */
    private Map<String, Object> valMap;

    public DecisionMatterReq() {
    }

    public DecisionMatterReq(String userId, Long treeId, Map<String, Object> valMap) {
        this.userId = userId;
        this.treeId = treeId;
        this.valMap = valMap;
    }

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<String, Object> getValMap() {
        return valMap;
    }

    public void setValMap(Map<String, Object> valMap) {
        this.valMap = valMap;
    }

}