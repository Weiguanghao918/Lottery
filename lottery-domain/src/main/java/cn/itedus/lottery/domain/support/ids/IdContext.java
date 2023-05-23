package cn.itedus.lottery.domain.support.ids;

import cn.hutool.core.lang.Snowflake;
import cn.itedus.lottery.common.Constants;
import cn.itedus.lottery.domain.support.ids.policy.RandomNumeric;
import cn.itedus.lottery.domain.support.ids.policy.ShortCode;
import cn.itedus.lottery.domain.support.ids.policy.SnowFlake;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-23 16:41
 * @description: Id 策略模式上下文配置「在正式的完整的系统架构中，ID 的生成会有单独的服务来完成，其他服务来调用 ID 生成接口即可」
 */
@Configuration
public class IdContext {

    /**
     * 创建ID生成策略，属于策略设计模式的使用方式
     *
     * @param snowFlake     雪花算法：长码，大量
     * @param shortCode     短码算法：短码，大量，全局唯一需要自己保证
     * @param randomNumeric 随机算法：短码，大量，全局唯一需要自己保证
     * @return IdGenerator实现类
     */
    @Bean
    public Map<Enum<Constants.Ids>, IdGenerator> idGenerator(SnowFlake snowFlake, ShortCode shortCode, RandomNumeric randomNumeric) {
        Map<Enum<Constants.Ids>, IdGenerator> idGeneratorMap = new HashMap<>(8);
        idGeneratorMap.put(Constants.Ids.SnowFlake, snowFlake);
        idGeneratorMap.put(Constants.Ids.ShortCode, shortCode);
        idGeneratorMap.put(Constants.Ids.RandomNumeric, randomNumeric);
        return idGeneratorMap;
    }
}
