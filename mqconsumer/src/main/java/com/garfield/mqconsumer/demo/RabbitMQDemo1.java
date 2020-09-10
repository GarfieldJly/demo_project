package com.garfield.mqconsumer.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author jingliyuan
 * @date 2020/9/9
 */
@Component
@Slf4j
public class RabbitMQDemo1 {
    @RabbitListener(queues = "aaa")
    public void receive(String message){
        log.info(String.format("收到RabbitMQ的消息:%s",message));
    }
}
