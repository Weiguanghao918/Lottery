package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.domain.activity.model.req.ActivityInfoLimitPageReq;
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
    /**
     * 插入数据
     *
     * @param req 入参
     */
    void insert(Activity req);

    /**
     * 根据活动号查询活动信息
     *
     * @param activityId 活动号
     * @return 活动信息
     */
    Activity queryActivityById(Long activityId);

    /**
     * 变更活动状态
     *
     * @param alterStateVO [activityId、beforeState、afterState]
     * @return 更新数量
     */
    int alterState(AlterStateVO alterStateVO);

    /**
     * 扣减活动库存
     *
     * @param activityId 活动ID
     * @return 更新数量
     */
    int subtractionActivityStock(Long activityId);

    /**
     * 扫描待处理的活动列表，状态为：通过、活动中
     *
     * @param id ID
     * @return 待处理的活动集合
     */
    List<Activity> scanToDoActivityList(Long id);

    /**
     * 更新用户领取活动后，活动库存
     *
     * @param activity 入参
     */
    void updateActivityStock(Activity activity);

    /**
     * 查询活动分页数据数量
     *
     * @param req 入参
     * @return 结果
     */
    Long queryActivityInfoCount(ActivityInfoLimitPageReq req);

    /**
     * 查询活动分页数据列表
     *
     * @param req 入参
     * @return 结果
     */
    List<Activity> queryActivityInfoList(ActivityInfoLimitPageReq req);
}
