package com.garfield.mqconsumer.demo.config;

import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jingliyuan
 * @date 2020/9/11
 */
@Configuration
public class MessageListenerConfig {
    @Autowired
    private CachingConnectionFactory connectionFactory;
    @Autowired
    private MyACKListener myACKListener;

    @Bean
    public SimpleMessageListenerContainer createSimpleMessageListenerContainer(){
        SimpleMessageListenerContainer container =  new SimpleMessageListenerContainer(connectionFactory);
        //设置并发消费者数量
        container.setConcurrentConsumers(1);
        //设置最大的并发消费者数量
        container.setMaxConcurrentConsumers(1);
        // RabbitMQ默认是自动确认，这里改为手动确认消息
        container.setAcknowledgeMode(AcknowledgeMode.MANUAL);
        container.setQueueNames("TestDirectQueue");
        container.setMessageListener(myACKListener);
        return container;
    }
}
