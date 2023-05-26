package cn.itedus.lottery.test.domain;

import cn.itedus.lottery.domain.rule.model.req.DecisionMatterReq;
import cn.itedus.lottery.domain.rule.model.res.EngineResult;
import cn.itedus.lottery.domain.rule.service.engine.EngineFilter;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author: Guanghao Wei
 * @date: 2023-05-26 13:58
 * @description: 规则引擎测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RuleTest {

    private Logger logger = LoggerFactory.getLogger(RuleTest.class);

    @Resource
    private EngineFilter engineFilter;

    @Test
    public void test_process() {
        DecisionMatterReq req = new DecisionMatterReq();
        req.setTreeId(2110081902L);
        req.setUserId("Komorebi");
        req.setValMap(new HashMap<String, Object>() {{
            put("gender", "man");
            put("age", 22);
        }});

        EngineResult res = engineFilter.process(req);
        logger.info("请求参数:{}", JSON.toJSONString(req));
        logger.info("测试结果:{}", JSON.toJSONString(res));
    }
}
