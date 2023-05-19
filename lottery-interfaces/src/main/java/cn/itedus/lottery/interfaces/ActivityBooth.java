package cn.itedus.lottery.interfaces;

import cn.itedus.lottery.common.Result;
import cn.itedus.lottery.infrastructure.dao.IActivityDao;
import cn.itedus.lottery.infrastructure.po.Activity;
import cn.itedus.lottery.rpc.IActivityBooth;
import cn.itedus.lottery.rpc.dto.ActivityDto;
import cn.itedus.lottery.rpc.req.ActivityReq;
import cn.itedus.lottery.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-19 15:55
 * @description: 这活动展台接口类的具体实现，用于包装活动的创建、查询、修改、审核。
 */
@Service
public class ActivityBooth implements IActivityBooth {
    @Resource
    private IActivityDao activityDao;

    /**
     * 供 DTO 的对象并返回 Res 结果。目前dto的创建后续可以使用门面模式和工具类进行处理
     * @param req
     * @return
     */
    @Override
    public ActivityRes queryActivityById(ActivityReq req) {
        Activity activity = activityDao.queryActivityById(req.getActivityId());
        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());
        activityDto.setState(activity.getState());

        return new ActivityRes(Result.buildSuccessResult(), activityDto);
    }
}

