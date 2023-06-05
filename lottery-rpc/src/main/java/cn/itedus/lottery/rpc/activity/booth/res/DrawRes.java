package cn.itedus.lottery.rpc.activity.booth.res;

import cn.itedus.lottery.common.Result;
import cn.itedus.lottery.rpc.activity.booth.dto.AwardDTO;

import java.io.Serializable;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-29 10:47
 * @description: 抽奖返回结果
 */
public class DrawRes extends Result implements Serializable {

    private AwardDTO awardDTO;

    public DrawRes(String code, String info) {
        super(code, info);
    }

    public AwardDTO getAwardDTO() {
        return awardDTO;
    }

    public void setAwardDTO(AwardDTO awardDTO) {
        this.awardDTO = awardDTO;
    }

}