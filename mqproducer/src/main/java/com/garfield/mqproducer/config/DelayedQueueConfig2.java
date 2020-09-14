package com.garfield.mqproducer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;


@Configuration
public class DelayedQueueConfig2 {
    /**
     * 存放消息的队列
     */
    @Bean
    public Queue createQueue2(){
        return new Queue("storeQueue2");
    }

    /**
     * 死信队列
     */
    @Bean
    public Queue createDeadQueue2(){
        HashMap map = new HashMap<String,String>();
        map.put("x-dead-letter-exchange","storeDirectExchange2");
        map.put("x-dead-letter-routing-key", "store2");
        return new Queue("delayQueue2",true,false,false,map);
    }

    @Bean
    public DirectExchange createDirectExchange2(){
        return new DirectExchange("storeDirectExchange2");
    }

    @Bean
    public DirectExchange createDeadDirectExchange2(){
        return new DirectExchange("deadDirectExchange2");
    }
    @Bean
    public Binding bindStore2(){
        return BindingBuilder.bind(createQueue2()).to(createDirectExchange2()).with("store2");
    }

    @Bean
    public Binding bindDead2(){
        return BindingBuilder.bind(createDeadQueue2()).to(createDeadDirectExchange2()).with("dead2");
    }

}
