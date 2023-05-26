package cn.itedus.lottery.infrastructure.po;

import java.util.Date;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-26 13:31
 * @description: 规则树
 */
public class RuleTree {

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 规则树名称
     */
    private String treeName;
    /**
     * 规则树描述
     */
    private String treeDesc;
    /**
     * 规则树根ID
     */
    private Long treeRootNodeId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public String getTreeDesc() {
        return treeDesc;
    }

    public Long getTreeRootNodeId() {
        return treeRootNodeId;
    }

    public void setTreeRootNodeId(Long treeRootNodeId) {
        this.treeRootNodeId = treeRootNodeId;
    }

    public void setTreeDesc(String treeDesc) {
        this.treeDesc = treeDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

