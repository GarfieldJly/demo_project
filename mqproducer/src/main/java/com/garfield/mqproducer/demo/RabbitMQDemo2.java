package com.garfield.mqproducer.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author jingliyuan
 * @date 2020/9/8
 */
@Configuration
@Slf4j
public class RabbitMQDemo2 {
    @Autowired
    @Qualifier("firstRabbitTemplate")
    private RabbitTemplate rabbitTemplate;

    @PostConstruct
    public void send(){
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setExpiration("2000");
        Message message = new Message("蜂蜜柚子".getBytes(),messageProperties);
        rabbitTemplate.send("deadExchange","dead",message);
        log.info("测试有延时的队列,RabbitMQ发送消息");
    }
}
