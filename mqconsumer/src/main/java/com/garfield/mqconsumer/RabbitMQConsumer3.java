package com.garfield.mqconsumer;

import com.alibaba.fastjson.JSONObject;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ObjectUtils;
import sun.java2d.pipe.SpanShapeRenderer;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
public class RabbitMQConsumer3 {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    @RabbitListener(queues = "storeQueue2")
    public void receive(Message message) {
        byte[] body = message.getBody();
        JSONObject jsonObject = JSONObject.parseObject(new String(body));
        String msg = jsonObject.getString("message");
        Integer retryTime = jsonObject.getInteger("retryTime");
        String ttlTime = jsonObject.getString("ttlTime");

        MessageProperties messageProperties = new MessageProperties();
        Integer newTtlTime = Integer.valueOf(ttlTime) * 2;
        messageProperties.setExpiration(newTtlTime + "");


        if (retryTime <= 5) {
            jsonObject.put("retryTime", ++retryTime);
            jsonObject.put("ttlTime",newTtlTime);
            Message newMessage = new Message(jsonObject.toJSONString().getBytes(), messageProperties);
            rabbitTemplate.convertAndSend("deadDirectExchange2", "dead2", newMessage);

            System.out.println("延迟队列的消息: " + msg +"当前时间:"+ simpleDateFormat.format(new Date()));
        } else {
            System.out.println("重试结束");
        }


    }
}
