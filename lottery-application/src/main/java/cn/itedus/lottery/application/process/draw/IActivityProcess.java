package cn.itedus.lottery.application.process.draw;

import cn.itedus.lottery.application.process.draw.req.DrawProcessReq;
import cn.itedus.lottery.application.process.draw.res.DrawProcessResult;
import cn.itedus.lottery.application.process.draw.res.RuleQuantificationCrowdResult;
import cn.itedus.lottery.domain.rule.model.req.DecisionMatterReq;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-25 17:15
 * @description: 活动抽奖流程编排接口
 */
public interface IActivityProcess {
    /**
     * 执行抽奖流程
     *
     * @param req 抽奖请求入参
     * @return 抽奖结果
     */
    DrawProcessResult doDrawProcess(DrawProcessReq req);

    /**
     * 规则化量化人群，返回可参与的活动ID
     *
     * @param req 规则请求
     * @return 量化结果，用户可以参与的活动
     */
    RuleQuantificationCrowdResult doRuleQuantificationCrowd(DecisionMatterReq req);
}
