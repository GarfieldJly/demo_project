package com.garfield.cache.redis.pubsub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author jingliyuan
 * @date 2020/10/22
 */
@Component
@Profile("pubsub")
public class SmsChannelListener2 {
    @Bean
    public RedisMessageListenerContainer subscribeRedisMessageListenerContainer(RedisConnectionFactory factory){
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(factory);
        container.addMessageListener((message, bytes) -> {
            System.out.println("用Spring 的方式实现，收到messgae："+message);
        }, Arrays.asList(new ChannelTopic(RedisPublishDemo1.SMS_NAME)));
        return container;
    }
}
