package com.garfield.mqproducer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;


@Configuration
public class DelayedQueueConfig {
    /**
     * 存放消息的队列
     */
    @Bean
    public Queue createQueue(){
        return new Queue("storeQueue");
    }

    /**
     * 死信队列
     */
    @Bean
    public Queue createDeadQueue(){
        HashMap map = new HashMap<String,String>();
        map.put("x-dead-letter-exchange","storeDirectExchange");
        map.put("x-dead-letter-routing-key", "store");
        return new Queue("delayQueue",true,false,false,map);
    }

    @Bean
    public DirectExchange createDirectExchange(){
        return new DirectExchange("storeDirectExchange");
    }

    @Bean
    public DirectExchange createDeadDirectExchange(){
        return new DirectExchange("deadDirectExchange");
    }
    @Bean
    public Binding bindStore(){
        return BindingBuilder.bind(createQueue()).to(createDirectExchange()).with("store");
    }

    @Bean
    public Binding bindDead(){
        return BindingBuilder.bind(createDeadQueue()).to(createDeadDirectExchange()).with("dead");
    }

}
