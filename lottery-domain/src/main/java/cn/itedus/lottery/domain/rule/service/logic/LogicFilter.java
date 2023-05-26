package cn.itedus.lottery.domain.rule.service.logic;

import cn.itedus.lottery.domain.rule.model.req.DecisionMatterReq;
import cn.itedus.lottery.domain.rule.model.vo.TreeNodeLineVO;

import java.util.List;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-26 12:10
 * @description: 规则过滤器接口
 */
public interface LogicFilter {

    /**
     * 逻辑决策器
     *
     * @param matterValue        决策值
     * @param treeNodeLineVOList 决策节点
     * @return 下一个节点
     */
    Long filter(String matterValue, List<TreeNodeLineVO> treeNodeLineVOList);

    /**
     * 获取决策值
     *
     * @param decisionMatter 决策物料
     * @return 决策值
     */
    String matterValue(DecisionMatterReq decisionMatter);
}
