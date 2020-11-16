package com.garfield.cache.redis.pubsub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author jingliyuan
 * @date 2020/10/22
 */
@Service
public class RedisPublishDemo1 {
    @Autowired
    private RedisTemplate redisTemplate;

    public final static String SMS_NAME = "smsName";

    public void publish(){
        redisTemplate.execute(new RedisCallback() {
            @Override
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                redisConnection.publish(SMS_NAME.getBytes(),"来自加菲猫的短信".getBytes());
                return null;
            }
        });
    }
}
