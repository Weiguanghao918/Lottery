package cn.itedus.lottery.test;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-19 16:20
 * @description:
 */
@SpringBootApplication
@Configuration
public class ApiTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiTestApplication.class, args);
    }
}
