package cn.itedus.lottery.domain.strategy.repository;

import cn.itedus.lottery.domain.strategy.model.aggregates.StrategyRich;
import cn.itedus.lottery.domain.strategy.model.vo.AwardBriefVO;

import java.util.List;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-22 11:35
 * @description: 策略表仓储服务
 */
public interface IStrategyRepository {
    /**
     * 根据策略id查询聚合根对象
     * @param strategyId 策略ID
     * @return 聚合根
     */
    StrategyRich queryStrategyRich(Long strategyId);

    /**
     * 根据奖品id查询奖品信息
     * @param awardId 奖品Id
     * @return 奖品信息
     */
    AwardBriefVO queryAwardInfo(String awardId);

    /**
     * 查询满足条件的无库存商品
     * @param strategyId 策略ID
     * @return
     */
    List<String> queryNoStockStrategyAwardList(Long strategyId);

    /**
     * 扣减库存
     * @param strategyId 策略ID
     * @param awardId    奖品ID
     * @return           扣减结果
     */
    boolean deductStock(Long strategyId, String awardId);
}
