package com.garfield.cache.redis;

import com.garfield.cache.domain.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

/**
 * @author jingliyuan
 * @date 2020/10/20
 */
@Service
@EnableCaching
public class SpringCacheDemo1 {
    @Cacheable(cacheManager = "cacheManager",key = "#id",value = "cache-1")
    public User findUserById(String id){
        User user = new User("加菲猫",id);
        return user;
    }
    @CacheEvict(cacheManager = "cacheManager",key = "#id",value = "cache-1")
    public void deleteUserById(String id){
        System.out.println("用户从数据库删除成功，请检查缓存是否清除~~" + id);
    }

    @CachePut(cacheManager = "cacheManager",key = "#user.userId",value = "cache-1")
    public User updateUser(User user){
        // 读取数据库
        System.out.println("数据库进行了更新，检查缓存是否一致");
        return user; // 返回最新内容，代表更新成功
    }
}
