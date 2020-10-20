package com.garfield.cache.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author jingliyuan
 * @date 2020/10/20
 */
@Service
public class RedisPipelineDemo1 {
    @Autowired
    private RedisTemplate redisTemplate;

    public void save(){
        //普通模式存放数据
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            redisTemplate.opsForList().leftPush("queue-1",i);
        }
        System.out.println("操作完毕：" + redisTemplate.opsForList().size("queue_1"));
        System.out.println("普通模式一万次操作耗时：" + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        redisTemplate.executePipelined(new RedisCallback<Integer>() {
            @Override
            public Integer doInRedis(RedisConnection redisConnection) throws DataAccessException {
                for (int i = 0; i < 100; i++) {
                    redisConnection.lPush("queue-2".getBytes(),String.valueOf(i).getBytes());
                }
                return null;
            }
        });
        System.out.println("操作完毕：" + redisTemplate.opsForList().size("queue_2"));
        System.out.println("pipeline一万次操作耗时：" + (System.currentTimeMillis() - time));

    }
}
