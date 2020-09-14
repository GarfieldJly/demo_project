package com.garfield.mqproducer.demo;

import com.alibaba.fastjson.JSONObject;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/delayRabbitmq")
public class RabbitMQDemo3 {
    @Autowired
    private RabbitTemplate rabbitTemplate;


    @GetMapping("/send")
    public String send(String msg, String ttlTime) {
        int retryTime = 0;
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setExpiration(ttlTime);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message", msg);
        jsonObject.put("retryTime", retryTime);
        jsonObject.put("ttlTime",ttlTime);

        Message message = new Message(jsonObject.toJSONString().getBytes(), messageProperties);
        rabbitTemplate.convertAndSend("deadDirectExchange2", "dead2", message);
        return "ok";
    }
}
