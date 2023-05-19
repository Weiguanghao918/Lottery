package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-19 15:58
 * @description:
 */
@Mapper
public interface IActivityDao {
    void insert(Activity req);
    Activity queryActivityById(Long activityId);
}
