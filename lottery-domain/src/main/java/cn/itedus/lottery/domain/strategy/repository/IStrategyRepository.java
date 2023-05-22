package cn.itedus.lottery.domain.strategy.repository;

import cn.itedus.lottery.domain.strategy.model.aggregates.StrategyRich;
import cn.itedus.lottery.infrastructure.po.Award;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-22 11:35
 * @description:
 */
public interface IStrategyRepository {
    /**
     * 根据策略id查询聚合根对象
     * @param strategyId
     * @return
     */
    StrategyRich queryStrategyRich(Long strategyId);

    /**
     * 根据奖品id查询奖品信息
     * @param awardId
     * @return
     */
    Award queryAwardInfo(String awardId);
}
