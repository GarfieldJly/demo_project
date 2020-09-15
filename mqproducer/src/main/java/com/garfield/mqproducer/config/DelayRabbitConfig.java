package com.garfield.mqproducer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;


/**
 * @author jingliyuan
 * @date 2020/9/14
 * 实现延迟队列
 */
@Configuration
public class DelayRabbitConfig {
    /**
     * 创建普通的队列
     */
    @Bean
    public Queue storeQueue(){
        return new Queue("storeQueue");
    }

    /**
     * 创建死信队列
     */
    @Bean
    public Queue deadQueue(){
        Map propertiesMap = new HashMap();
        propertiesMap.put("x-dead-letter-exchange", "storeExchange");
        propertiesMap.put("x-dead-letter-routing-key", "store");
        return new Queue("deadQueue",false, false, false,propertiesMap);
    }
    @Bean
    public DirectExchange createStoreExchange(){
        return new DirectExchange("storeExchange");
    }

    @Bean
    public DirectExchange createDeadExchange(){
        return new DirectExchange("deadExchange");
    }

    /**
     * 创建绑定关系
     */
    @Bean
    public Binding bindingStore(){
        return BindingBuilder.bind(storeQueue()).to(createStoreExchange()).with("store");
    }

    /**
     * 创建绑定关系
     */
    @Bean
    public Binding bindingDead(){
        return BindingBuilder.bind(deadQueue()).to(createDeadExchange()).with("dead");
    }
}
