package com.garfield.cache.redis;

import com.garfield.cache.Application;
import com.garfield.cache.redis.pubsub.RedisPublishDemo1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jingliyuan
 * @date 2020/10/22
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("pubsub")
public class RedisPublishDemo1Test {
    @Autowired
    private RedisPublishDemo1 redisPublishDemo1;

    //测试发布/订阅
    @Test
    public void testPubSub(){
        redisPublishDemo1.publish();
    }


}
