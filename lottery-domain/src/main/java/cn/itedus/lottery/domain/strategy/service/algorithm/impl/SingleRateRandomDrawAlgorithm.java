package cn.itedus.lottery.domain.strategy.service.algorithm.impl;

import cn.itedus.lottery.domain.strategy.service.algorithm.BaseAlgorithm;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.List;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-22 13:04
 * @description: 【推荐】 单项概率抽奖，抽到一个已经排掉的奖品则未中奖
 */
@Component("singleRateRandomDrawAlgorithm")
public class SingleRateRandomDrawAlgorithm extends BaseAlgorithm {
    @Override
    public String randomDraw(Long strategyId, List<String> excludeAwardIds) {

        //获取策略对应的元组
        String[] rateTuple = super.rateTupleMap.get(strategyId);
        assert rateTuple != null;

        //随机索引
        int randomVal = this.generateSecureRandomIntCode(100);
        int idx = super.hashIdx(randomVal);

        //返回结果
        String awardId = rateTuple[idx];
        if (excludeAwardIds.contains(awardId)) {
            return null;
        }
        return awardId;
    }
}
