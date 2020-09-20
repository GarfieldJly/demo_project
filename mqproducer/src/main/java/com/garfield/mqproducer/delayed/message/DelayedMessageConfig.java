package com.garfield.mqproducer.delayed.message;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.CustomExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;


/**
 * @author jingliyuan
 * @date 2020/9/15
 */
@Configuration
public class DelayedMessageConfig {
    public final static String DELAYED_QUEUE = "delayedQueue3";
    public final static String DELAYED_EXCHANGE = "delayedExchange3";
    public final static String DELAYED_ROUTING_KEY = "delayed3";

    @Bean
    public Queue createDelayedQueue2(){
        return new Queue(DELAYED_QUEUE);
    }
    @Bean
    public CustomExchange createDelayedExchange2(){
        Map<String, Object> args = new HashMap<>();
        args.put("x-delayed-type", "direct");
        return new CustomExchange(DELAYED_EXCHANGE, "x-delayed-message", true, false, args);
    }
    @Bean
    public Binding binding2(){
        return BindingBuilder.bind(createDelayedQueue2()).to(createDelayedExchange2()).with(DELAYED_ROUTING_KEY).noargs();
    }
}
