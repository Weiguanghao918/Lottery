package cn.itedus.lottery.rpc.activity.deploy.res;

import cn.itedus.lottery.common.Result;
import cn.itedus.lottery.rpc.activity.deploy.dto.ActivityDTO;

import java.io.Serializable;
import java.util.List;

/**
 * @author: Guanghao Wei
 * @date: 2023-06-05 14:03
 * @description: 活动结果查询
 */
public class ActivityRes implements Serializable {

    private Result result;
    private Long count;
    private List<ActivityDTO> activityDTOList;

    public ActivityRes() {
    }

    public ActivityRes(Result result) {
        this.result = result;
    }

    public ActivityRes(Result result, Long count, List<ActivityDTO> activityDTOList) {
        this.result = result;
        this.count = count;
        this.activityDTOList = activityDTOList;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<ActivityDTO> getActivityDTOList() {
        return activityDTOList;
    }

    public void setActivityDTOList(List<ActivityDTO> activityDTOList) {
        this.activityDTOList = activityDTOList;
    }

}
