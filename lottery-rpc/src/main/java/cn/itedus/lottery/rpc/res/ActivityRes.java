package cn.itedus.lottery.rpc.res;

import cn.itedus.lottery.common.Result;
import cn.itedus.lottery.rpc.dto.ActivityDto;

import java.io.Serializable;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-19 15:38
 * @description: 出参res
 */
public class ActivityRes implements Serializable {

    private Result result;
    private ActivityDto activity;

    public ActivityRes() {
    }

    public ActivityRes(Result result) {
        this.result = result;
    }

    public ActivityRes(Result result, ActivityDto activity) {
        this.result = result;
        this.activity = activity;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public ActivityDto getActivity() {
        return activity;
    }

    public void setActivity(ActivityDto activity) {
        this.activity = activity;
    }

}