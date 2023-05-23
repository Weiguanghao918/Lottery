package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-22 11:12
 * @description:
 */
@Mapper
public interface IStrategyDao {

    /**
     * 根据策略Id获取策略
     * @param strategyId
     * @return
     */
    Strategy queryStrategy(Long strategyId);

    void insert(Strategy req);
}
