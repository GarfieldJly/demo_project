package com.garfield.mqconsumer.demo.delay;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @author jingliyuan
 * @date 2020/9/14
 */
@Configuration
@Slf4j
public class DelayReceiveDemo1 {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RabbitListener(queues = "storeQueue")
    public void receive1(Message msg){
        JSONObject jsonObject = JSON.parseObject(new String(msg.getBody()));
        String message = jsonObject.getString("message");
        Integer retryCount = jsonObject.getInteger("retryCount");
        String ttlTime = jsonObject.getString("ttlTime");

        if(retryCount < 5){
            MessageProperties messageProperties = new MessageProperties();
            int newTtlTime = Integer.valueOf(ttlTime) * 2;
            messageProperties.setExpiration(newTtlTime+"");
            Message newMessage = new Message(message.getBytes(),messageProperties);
            rabbitTemplate.convertAndSend("deadExchange","dead",newMessage);
            log.info( "测试延时队列  storeQueue: "+new String(msg.getBody()));
        }else{
            log.info("重试结束");
        }


    }
}
