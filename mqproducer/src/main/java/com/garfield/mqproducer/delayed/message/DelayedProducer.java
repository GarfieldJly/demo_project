package com.garfield.mqproducer.delayed.message;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jingliyuan
 * @date 2020/9/15
 */
@RestController
@RequestMapping("/delayedMessage")
public class DelayedProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/send")
    public String send(String msg,Integer delayed){
        rabbitTemplate.convertAndSend(DelayedMessageConfig.DELAYED_EXCHANGE, DelayedMessageConfig.DELAYED_ROUTING_KEY, msg, message -> {
            message.getMessageProperties().setDelay(delayed);
            return message;
        });
        return "OK";
    }
}
