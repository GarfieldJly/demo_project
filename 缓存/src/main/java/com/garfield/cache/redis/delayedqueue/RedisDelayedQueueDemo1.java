package com.garfield.cache.redis.delayedqueue;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Configuration
@Profile("delayed-queue")
public class RedisDelayedQueueDemo1 {
    private final static String KEY_NAME = "keyName";
    private final static String CONTENT_NAME = "contentName";
    @Autowired
    private RedisTemplate redisTemplate;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

   @Bean
    public RedisMessageListenerContainer redisMessageListenerContainer(RedisConnectionFactory factory){
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(factory);
        container.addMessageListener(new DelayedQueueMessageListener(),new PatternTopic("__keyevent@0__:expired"));
        return container;
    }

    public void create(){
        String orderId = UUID.randomUUID().toString();

        redisTemplate.opsForValue().set(orderId,KEY_NAME,3, TimeUnit.SECONDS);
        String content = "{\"count\":1,\"ttl\":3,\"content\":\"加菲猫\"}";
        redisTemplate.opsForValue().set(CONTENT_NAME + orderId ,content);
    }

    class DelayedQueueMessageListener implements MessageListener {

        @Override
        public void onMessage(Message message, byte[] bytes) {
            String content = (String) redisTemplate.opsForValue().get(CONTENT_NAME + message);
            JSONObject jsonObject = JSONObject.parseObject(content);
            Integer count = jsonObject.getInteger("count");
            Integer ttl = jsonObject.getInteger("ttl");
            String content1 = jsonObject.getString("content");
            if(count <= 5){
                System.out.println("消息为:" + content1 + ";;count :" + count);
                System.out.println("当前时间:" + simpleDateFormat.format(new Date()));
                //修改重试次数和过期时间
                count++;
                ttl = ttl * 2;
                jsonObject.put("count",count);
                jsonObject.put("ttl",ttl);
                redisTemplate.opsForValue().set(CONTENT_NAME + message,jsonObject.toJSONString());
                redisTemplate.opsForValue().set(message.toString(),KEY_NAME,ttl,TimeUnit.SECONDS);
            }else{
                redisTemplate.delete(CONTENT_NAME + message);
                System.out.println("删除********");
            }

        }
    }
}

