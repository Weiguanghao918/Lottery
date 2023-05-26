package cn.itedus.lottery.domain.rule.model.res;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-26 12:02
 * @description: 决策结果
 */
public class EngineResult {

    /**
     * 执行结果
     */
    private boolean isSuccess;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 规则树ID
     */
    private Long treeId;
    /**
     * 果实节点ID
     */
    private Long nodeId;
    /**
     * 果实节点值
     */
    private String nodeValue;

    public EngineResult() {
    }

    public EngineResult(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public EngineResult(String userId, Long treeId, Long nodeId, String nodeValue) {
        this.isSuccess = true;
        this.userId = userId;
        this.treeId = treeId;
        this.nodeId = nodeId;
        this.nodeValue = nodeValue;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }
}
