package com.garfield.mqconsumer.demo.delay;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jingliyuan
 * @date 2020/9/9
 */
@Component
@Slf4j
public class DelayedMessageReceiveDemo2 {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    @RabbitListener(queues = "delayedQueue3")
    public void receive(Message message){
        log.info(String.format("收到RabbitMQ的消息:%s;;当前时间为: %s",new String(message.getBody()),simpleDateFormat.format(new Date())));
    }
}
