package cn.itedus.lottery.rpc;

import cn.itedus.lottery.rpc.req.ActivityReq;
import cn.itedus.lottery.rpc.res.ActivityRes;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-19 15:45
 * @description: 活动展示，用于包装活动的创建、查询、修改、审核的接口。
 */
public interface IActivityBooth {
    ActivityRes queryActivityById(ActivityReq req);
}
