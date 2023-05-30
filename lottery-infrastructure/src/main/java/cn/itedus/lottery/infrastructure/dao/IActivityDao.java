package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.domain.activity.model.vo.AlterStateVO;
import cn.itedus.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-19 15:58
 * @description:
 */
@Mapper
public interface IActivityDao {
    void insert(Activity req);
    Activity queryActivityById(Long activityId);

    int alterState(AlterStateVO alterStateVO);

    int subtractionActivityStock(Long activityId);

    List<Activity> scanToDoActivityList(long id);
}
