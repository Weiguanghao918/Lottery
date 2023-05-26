package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.RuleTree;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-26 13:32
 * @description: 规则树配置DAO
 */
@Mapper
public interface RuleTreeDao {
    /**
     * 规则树查询
     *
     * @param id ID
     * @return 规则树
     */
    RuleTree queryRuleTreeByTreeId(Long id);
}
