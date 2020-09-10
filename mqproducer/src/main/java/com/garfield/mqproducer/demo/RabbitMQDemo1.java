package com.garfield.mqproducer.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author jingliyuan
 * @date 2020/9/8
 */
@Component
@Slf4j
public class RabbitMQDemo1 {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @PostConstruct
    public void send(){
        rabbitTemplate.convertAndSend("dog","aa","汪汪汪");
        log.info("RabbitMQ发送消息");
    }
}
