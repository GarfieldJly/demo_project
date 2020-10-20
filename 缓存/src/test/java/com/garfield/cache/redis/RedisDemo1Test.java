package com.garfield.cache.redis;

import com.garfield.cache.Application;
import com.garfield.cache.domain.User;
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
public class RedisDemo1Test {
    @Autowired
    private RedisDemo1 redisDemo1;
    @Test
    public void test1(){
        redisDemo1.setName();
    }

    @Test
    public void test2(){
        User user = redisDemo1.saveUser("18");
        System.out.println(user);
    }

}
