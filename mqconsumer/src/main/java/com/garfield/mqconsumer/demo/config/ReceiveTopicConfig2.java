package com.garfield.mqconsumer.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * @author jingliyuan
 * @date 2020/9/10
 */
//@Configuration
@RabbitListener(queues = "topic.woman")
@Slf4j
public class ReceiveTopicConfig2 {
    @RabbitHandler
    public void receive1(String msg){
        log.info("TopicExchange 收到topic.woman的消息:" + msg);
    }
}
