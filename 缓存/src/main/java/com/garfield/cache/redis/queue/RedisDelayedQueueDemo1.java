package com.garfield.cache.redis.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

/**
 * @author jingliyuan
 * @date 2020/10/22
 */
@Configuration
public class RedisDelayedQueueDemo1 {
    @Autowired
    private RedisTemplate redisTemplate;

    private final String DELAYED_QUEME_MESSAGE_NAME = "delayedQueueMessage";
    @Bean
    public RedisMessageListenerContainer redisMessageListenerContainer(RedisConnectionFactory factory){
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(factory);
        //监听过期key
        container.addMessageListener(new MyMessageListener(),new PatternTopic("__keyevent@0__:expired"));
        return  container;
    }


}

class MyMessageListener implements MessageListener{

    @Override
    public void onMessage(Message message, byte[] bytes) {
        //todo 业务代码实现
    }
}
