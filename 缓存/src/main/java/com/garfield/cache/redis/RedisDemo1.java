package com.garfield.cache.redis;

import com.garfield.cache.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * @author jingliyuan
 * @date 2020/10/20
 */
@Service
@Profile("single")
public class RedisDemo1 {
    //存String类型的
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    //存储对象类型的
    @Autowired
    private RedisTemplate redisTemplate;


    public void setName(){
        stringRedisTemplate.opsForValue().set("name","garfield");
        stringRedisTemplate.opsForValue().set("sex","female");

        System.out.println(stringRedisTemplate.opsForValue().get("name"));
        System.out.println(stringRedisTemplate.opsForValue().get("sex"));
    }

    //对象缓存功能
    public User saveUser(String userId){
        User existUser = (User) redisTemplate.opsForValue().get(userId);
        //1.从redis缓存中取
        if(!ObjectUtils.isEmpty(existUser)){
            System.out.println("从缓存中取值:" + existUser);
            return existUser;
        }
        //todo 2.从数据库中查询

        //3.把数据库查询的值放到redis中
        User newUser = new User("jingly",userId);
        redisTemplate.opsForValue().set(userId,newUser);
        return newUser;
    }

}
