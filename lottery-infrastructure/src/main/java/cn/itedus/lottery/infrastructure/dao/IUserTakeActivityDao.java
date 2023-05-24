package cn.itedus.lottery.infrastructure.dao;


import cn.itedus.lottery.infrastructure.po.UserTakeActivity;

import cn.itedus.middleware.db.router.annotation.DBRouter;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-24 14:26
 * @description: 用户领取活动表DAO
 */
@Mapper
public interface IUserTakeActivityDao {

    /**
     * 插入用户领取活动信息
     *
     * @param userTakeActivity 入参
     */
    @DBRouter(key = "uId")
    void insert(UserTakeActivity userTakeActivity);
}
