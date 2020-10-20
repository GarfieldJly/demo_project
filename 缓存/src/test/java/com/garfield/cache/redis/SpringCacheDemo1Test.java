package com.garfield.cache.redis;

import com.garfield.cache.Application;
import com.garfield.cache.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jingliyuan
 * @date 2020/10/20
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class SpringCacheDemo1Test {
    @Autowired
    private SpringCacheDemo1 springCacheDemo1;
    @Test
    public void test(){
        springCacheDemo1.findUserById("18");
        springCacheDemo1.deleteUserById("18");
        springCacheDemo1.updateUser(new User("garfiled","19"));
    }
}
