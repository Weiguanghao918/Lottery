package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-22 11:11
 * @description:
 */
@Mapper
public interface IAwardDao {
    /**
     * 根据奖品Id获取奖品
     * @param awardId
     * @return
     */
    Award queryAwardInfo(String awardId);
}
