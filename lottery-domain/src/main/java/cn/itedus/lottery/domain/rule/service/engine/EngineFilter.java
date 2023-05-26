package cn.itedus.lottery.domain.rule.service.engine;

import cn.itedus.lottery.domain.rule.model.req.DecisionMatterReq;
import cn.itedus.lottery.domain.rule.model.res.EngineResult;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-26 12:30
 * @description: 规则过滤器引擎
 */
public interface EngineFilter {
    /**
     * 规则过滤器接口
     *
     * @param matter 规则决策物料
     * @return 规则决策结果
     */
    EngineResult process(final DecisionMatterReq matter);
}
