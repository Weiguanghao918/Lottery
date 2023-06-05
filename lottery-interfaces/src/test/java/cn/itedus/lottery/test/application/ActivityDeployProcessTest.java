package cn.itedus.lottery.test.application;

import cn.itedus.lottery.application.process.deploy.IActivityDeployProcess;
import cn.itedus.lottery.domain.activity.model.aggregates.ActivityInfoLimitPageRich;
import cn.itedus.lottery.domain.activity.model.req.ActivityInfoLimitPageReq;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author: Guanghao Wei
 * @date: 2023-06-05 14:49
 * @description: ERP后台活动数据展示测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivityDeployProcessTest {

    private Logger logger = LoggerFactory.getLogger(ActivityDeployProcessTest.class);

    @Resource
    private IActivityDeployProcess activityDeployProcess;

    @Test
    public void activityDeploy_test() {
        ActivityInfoLimitPageReq req = new ActivityInfoLimitPageReq(1, 2);
        req.setActivityId(100001L);
        ActivityInfoLimitPageRich activityInfoLimitPageRich = activityDeployProcess.queryActivityInfoLimitPage(req);
        logger.info("入参：{}", JSON.toJSONString(req));
        logger.info("出参：{}", JSON.toJSON(activityInfoLimitPageRich));
    }
}
