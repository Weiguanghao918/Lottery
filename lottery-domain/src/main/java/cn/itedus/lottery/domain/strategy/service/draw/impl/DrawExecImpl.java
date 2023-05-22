package cn.itedus.lottery.domain.strategy.service.draw.impl;

import cn.itedus.lottery.domain.strategy.service.algorithm.IDrawAlgorithm;
import cn.itedus.lottery.domain.strategy.service.draw.AbstractDrawBase;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-22 15:02
 * @description: 抽奖过程方法实现
 */
@Service("drawExec")
public class DrawExecImpl extends AbstractDrawBase {
    private Logger logger = LoggerFactory.getLogger(DrawExecImpl.class);

    /**
     * 执行真正的抽奖处理过程
     * @param strategyId 策略Id
     * @param drawAlgorithm 抽奖算法
     * @param excludeAwardIds 没有库存的商品Id集合
     * @return 根据库存情况返回奖品Id
     */
    @Override
    protected String drawAlgorithm(Long strategyId, IDrawAlgorithm drawAlgorithm, List<String> excludeAwardIds) {
        //执行抽奖
        String awardId = drawAlgorithm.randomDraw(strategyId, excludeAwardIds);

        //判断抽奖结果
        if (awardId == null) {
            return null;
        }
        /*
         * 扣减库存，暂时采用数据库行级锁的方式进行扣减库存，后续优化为 Redis 分布式锁扣减 decr/incr
         * 注意：通常数据库直接锁行记录的方式并不能支撑较大体量的并发，但此种方式需要了解，因为在分库分表下的正常数据流量下的个人数据记录中，是可以使用行级锁的，因为他只影响到自己的记录，不会影响到其他人
         */

        boolean isSuccess = strategyRepository.deductStock(strategyId, awardId);

        // 返回结果，库存扣减成功返回奖品ID，否则返回NULL 「在实际的业务场景中，如果中奖奖品库存为空，则会发送兜底奖品，比如各类券」
        return isSuccess ? awardId : null;
    }

    /**
     * 查询已经没有库存的奖品信息
     * @param strategyId 策略ID
     * @return 没有库存的奖品id列表
     */
    @Override
    protected List<String> queryExcludeAwardIds(Long strategyId) {
        List<String> awardList = strategyRepository.queryNoStockStrategyAwardList(strategyId);
        logger.info("执行抽奖策略 strategyId：{}，无库存排除奖品列表ID集合 awardList：{}", strategyId, JSON.toJSONString(awardList));
        return awardList;
    }
}
