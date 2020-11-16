package com.garfield.cache.redis.pubsub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author jingliyuan
 * @date 2020/10/22
 */
@Component
public class SmsChannelListener {
    @Autowired
    private RedisTemplate redisTemplate;

    @PostConstruct
    public void subscribe(){
        redisTemplate.execute(new RedisCallback() {
            @Override
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                redisConnection.subscribe(new MessageListener() {
                    @Override
                    public void onMessage(Message message, byte[] bytes) {
                        System.out.println("收到消息:" + message);
                    }
                },RedisPublishDemo1.SMS_NAME.getBytes());
                return null;
            }
        });
    }
}
