package com.garfield.cache.redis;

import com.garfield.cache.Application;
import com.garfield.cache.domain.User;
import com.garfield.cache.redis.delayedqueue.RedisDelayedQueueDemo1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Scanner;

/**
 * @author jingliyuan
 * @date 2020/10/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("delayed-queue")
public class RedisDelayedQueueDemo1Test {
    @Autowired
    private RedisDelayedQueueDemo1 redisDemo1;
    @Test
    public void test1(){
        redisDemo1.create();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

    }


}
