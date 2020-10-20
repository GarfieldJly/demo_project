package com.garfield.cache.redis;

import com.garfield.cache.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jingliyuan
 * @date 2020/10/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("single")
public class RedisPipelineDemo1Test {
    @Autowired
    private RedisPipelineDemo1 redisPipelineDemo1;
    @Test
    public void test1(){
        redisPipelineDemo1.save();
    }


}
