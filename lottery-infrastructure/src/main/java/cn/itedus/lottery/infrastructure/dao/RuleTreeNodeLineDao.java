package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.RuleTreeNodeLine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-26 13:33
 * @description: 规则数节点连线DAO
 */
@Mapper
public interface RuleTreeNodeLineDao {
    /**
     * 查询规则树节点连线集合
     *
     * @param req 入参
     * @return 规则树节点连线集合
     */
    List<RuleTreeNodeLine> queryRuleTreeNodeLineList(RuleTreeNodeLine req);
}
