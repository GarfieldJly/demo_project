package com.garfield.threadpool.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author jingliyuan
 * @date 2020/8/17
 */
@Configuration
public class RedisConfig {

//    @Bean(name = "template")
//    public RedisTemplate<String, Object> template(RedisConnectionFactory factory) {
//        // 创建RedisTemplate<String, Object>对象
//        RedisTemplate<String, Object> template = new RedisTemplate<>();
//        // 配置连接工厂
//        template.setConnectionFactory(factory);
//        // 定义Jackson2JsonRedisSerializer序列化对象
//        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
////        ObjectMapper om = new ObjectMapper();
////        // 指定要序列化的域，field,get和set,以及修饰符范围，ANY是都有包括private和public
////        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
////        // 指定序列化输入的类型，类必须是非final修饰的，final修饰的类，比如String,Integer等会报异常
////        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
////        stringRedisSerializer.setObjectMapper(om);
//        StringRedisSerializer stringSerial = new StringRedisSerializer();
//        // redis key 序列化方式使用stringSerial
//        template.setKeySerializer(stringSerial);
//        // redis value 序列化方式使用jackson
//        template.setValueSerializer(stringRedisSerializer);
//        // redis hash key 序列化方式使用stringSerial
//        template.setHashKeySerializer(stringSerial);
//        // redis hash value 序列化方式使用jackson
//        template.setHashValueSerializer(stringRedisSerializer);
//        template.afterPropertiesSet();
//        return template;
//    }

    @Bean
    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
        StringRedisTemplate template = new StringRedisTemplate(factory);
        //jackson将java对象转换成json对象。
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);
        template.setValueSerializer(jackson2JsonRedisSerializer);
        template.afterPropertiesSet();
        return template;
    }
}
