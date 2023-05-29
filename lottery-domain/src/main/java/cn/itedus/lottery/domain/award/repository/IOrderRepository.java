package cn.itedus.lottery.domain.award.repository;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-22 18:51
 * @description: 奖品表仓储服务接口
 */
public interface IOrderRepository {
    /**
     * 更新奖品发放状态
     *
     * @param uId        用户ID
     * @param orderId    订单ID
     * @param awardId    奖品ID
     * @param grantState 奖品状态
     */
    void updateUserAwardState(String uId, Long orderId, String awardId, Integer grantState);

}
