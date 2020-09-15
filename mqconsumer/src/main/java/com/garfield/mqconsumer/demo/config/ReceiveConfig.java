package com.garfield.mqconsumer.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * @author jingliyuan
 * @date 2020/9/10
 */
//@Configuration
@RabbitListener(queues = "TestDirectQueue")
@Slf4j
public class ReceiveConfig {
    @RabbitHandler
    public void receiveMessage(String msg) {
        log.info("收到 DirectExchange的消息:" + msg);
    }
}
