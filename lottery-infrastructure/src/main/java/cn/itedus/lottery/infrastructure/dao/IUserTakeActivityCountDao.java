package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.UserTakeActivityCount;
import cn.itedus.middleware.db.router.annotation.DBRouter;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-25 11:18
 * @description:
 */
@Mapper
public interface IUserTakeActivityCountDao {

    /**
     * 查询用户领取次数表
     * @param userTakeActivityCountReq 请求入参【活动号、用户ID】
     * @return 用户参与活动数量记录
     */
    @DBRouter
    UserTakeActivityCount queryUserTakeActivityCount(UserTakeActivityCount userTakeActivityCountReq);

    /**
     * 插入领取次数信息
     * @param userTakeActivityCount 请求入参
     */
    void insert(UserTakeActivityCount userTakeActivityCount);

    /**
     * 更新领取次数信息
     * @param userTakeActivityCount 请求入参
     * @return 更新数量
     */
    int updateLeftCount(UserTakeActivityCount userTakeActivityCount);
}
