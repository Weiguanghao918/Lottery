package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.RuleTreeNode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-26 13:33
 * @description: 规则树节点DAO
 */
@Mapper
public interface RuleTreeNodeDao {
    /**
     * 查询规则树节点
     *
     * @param treeId 规则树ID
     * @return 规则树节点集合
     */
    List<RuleTreeNode> queryRuleTreeNodeList(Long treeId);
}
