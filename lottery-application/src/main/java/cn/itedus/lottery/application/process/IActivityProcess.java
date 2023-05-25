package cn.itedus.lottery.application.process;

import cn.itedus.lottery.application.process.req.DrawProcessReq;
import cn.itedus.lottery.application.process.res.DrawProcessResult;

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
}
