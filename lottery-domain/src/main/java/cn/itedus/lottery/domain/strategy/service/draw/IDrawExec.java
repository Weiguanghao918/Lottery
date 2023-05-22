package cn.itedus.lottery.domain.strategy.service.draw;

import cn.itedus.lottery.domain.strategy.model.req.DrawReq;
import cn.itedus.lottery.domain.strategy.model.res.DrawResult;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-22 13:19
 * @description:
 */
public interface IDrawExec {

    /**
     * 根据入参对象，返回抽奖执行结果
     * @param req
     * @return
     */
    DrawResult doDrawExec(DrawReq req);
}
