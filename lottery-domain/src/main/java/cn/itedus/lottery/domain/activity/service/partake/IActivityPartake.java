package cn.itedus.lottery.domain.activity.service.partake;

import cn.itedus.lottery.domain.activity.model.req.PartakeReq;
import cn.itedus.lottery.domain.activity.model.res.PartakeResult;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-23 14:13
 * @description: 抽奖活动参与接口
 */
public interface IActivityPartake {

    /**
     * 参与活动接口
     *
     * @param req 入参
     * @return 领取结果
     */
    PartakeResult doPartake(PartakeReq req);
}
