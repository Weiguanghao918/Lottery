package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.StrategyDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-22 11:12
 * @description:
 */
@Mapper
public interface IStrategyDetailDao {
    /**
     * 根据策略id获取策略详细信息
     * @param strategyId
     * @return
     */
    List<StrategyDetail> queryStrategyDetailList(Long strategyId);

}
