package cn.itedus.lottery.domain.award.service.goods;

import cn.itedus.lottery.domain.award.repository.IAwardRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-22 18:53
 * @description: 配送货物基础共用类
 */
public class DistributionBase {
    protected Logger logger = LoggerFactory.getLogger(DistributionBase.class);

    @Resource
    private IAwardRepository awardRepository;

    /**
     * 添加更新分库分表中，用户个人的抽奖记录表中奖品发奖状态
     * @param uId               用户Id
     * @param orderId           订单Id
     * @param awardId           奖品Id
     * @param awardState        奖品状态
     * @param awardStateInfo    奖品状态信息
     */

    protected void updateUserAwardState(String uId, String orderId, String awardId, Integer awardState, String awardStateInfo) {
        // TODO 后期添加更新分库分表中，用户个人的抽奖记录表中奖品发奖状态
        logger.info("TODO 后期添加更新分库分表中，用户个人的抽奖记录表中奖品发奖状态 uId：{}", uId);
    }
}
