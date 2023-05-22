package cn.itedus.lottery.domain.strategy.service.draw;

import cn.itedus.lottery.domain.strategy.model.req.DrawReq;
import cn.itedus.lottery.domain.strategy.model.res.DrawResult;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-22 13:19
 * @description: 抽奖执行接口
 */
public interface IDrawExec {

    /**
     * 根据入参对象，返回抽奖执行结果
     * @param req 抽奖参数；用户ID、策略ID
     * @return 中奖结果
     */
    DrawResult doDrawExec(DrawReq req);
}
