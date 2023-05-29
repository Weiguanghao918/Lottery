package cn.itedus.lottery.test.application;

import cn.itedus.lottery.application.mq.KafkaProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-29 15:07
 * @description: Kafka 消息测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaProducerTest {

    private Logger logger = LoggerFactory.getLogger(KafkaProducerTest.class);

    @Resource
    private KafkaProducer kafkaProducer;

    @Test
    public void test_send() throws InterruptedException {
        // 循环发送消息
        while (true) {
            kafkaProducer.send("你好，我是Lottery 001");
            Thread.sleep(3500);
        }
    }
}