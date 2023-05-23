package cn.itedus.lottery.domain.support.ids;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-23 15:57
 * @description: 生成Id接口
 */
public interface IdGenerator {

    /**
     * 获取Id，目前有三种实现方式
     * 1. 雪花算法：用于生成单号
     * 2. 日期算法：用于生成活动编号类，特性是生成数字串较短，但指定时间内不能生成太多
     * 3. 随机算法，用于生成策略Id
     * @return Id
     */
    long nextId();
}
