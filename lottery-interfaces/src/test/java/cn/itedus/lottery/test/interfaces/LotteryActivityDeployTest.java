package cn.itedus.lottery.test.interfaces;

import cn.itedus.lottery.rpc.activity.ILotteryActivityDeploy;
import cn.itedus.lottery.rpc.activity.deploy.req.ActivityPageReq;
import cn.itedus.lottery.rpc.activity.deploy.res.ActivityRes;
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
 * @date: 2023-06-05 15:21
 * @description: 接口层部署活动测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LotteryActivityDeployTest {
    private Logger logger = LoggerFactory.getLogger(LotteryActivityBoothTest.class);
    @Resource
    private ILotteryActivityDeploy lotteryActivityDeploy;

    @Test
    public void lotteryActivityDeploy_test() {
        ActivityPageReq req = new ActivityPageReq(1, 2);
        req.setErpId("0001");
        ActivityRes activityRes = lotteryActivityDeploy.queryActivityListByPageForErp(req);
        logger.info("入参：{}", JSON.toJSON(req));
        logger.info("出参：{}", JSON.toJSON(activityRes));
    }
}
