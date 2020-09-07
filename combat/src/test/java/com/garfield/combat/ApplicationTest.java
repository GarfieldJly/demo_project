package com.garfield.combat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jingliyuan
 * @date 2020/9/1
 * 单元测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {

    @Test
    public void testInt(){
        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a==b);
        a = 100;
        b = 100;
        System.out.println(a==b);
    }

}