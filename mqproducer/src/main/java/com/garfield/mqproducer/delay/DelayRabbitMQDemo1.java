package com.garfield.mqproducer.delay;

import com.alibaba.fastjson.JSONObject;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jingliyuan
 * @date 2020/9/14
 * 写一个方法可以传延迟的时间,然后消费失败要重试,然后重试有个次数的限制
 */
@RestController
@RequestMapping("/delayRabbitMQ")
public class DelayRabbitMQDemo1 {
    @Autowired
    private RabbitTemplate rabbitTemplate;


    @GetMapping("/sendMessage")
    public String sendMessage(@RequestParam(value = "msg") String msg, @RequestParam(value = "ttlTime")String ttlTime){
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setExpiration(ttlTime);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message",msg);
        jsonObject.put("retryCount",0);
        jsonObject.put("ttlTime",ttlTime);
        Message message = new Message(jsonObject.toJSONString().getBytes(), messageProperties);
        rabbitTemplate.send("deadExchange","dead",message);
        return "ok";
    }

}
