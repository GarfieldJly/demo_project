package com.garfield.forkjoinpool;

import com.garfield.forkjoinpool.service.ForkJoinService1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jingliyuan
 * @date 2020/8/29
 */
//测试运行环境
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationTest.class)
public class ApplicationTest {
    @Before
    public void before(){
        System.out.println("开始测试");
    }
    @After
    public void after(){
        System.out.println("结束测度");
    }
    @Autowired
    private ForkJoinService1 forkJoinService1;
    @Test
    public void testForkJoinService1(){
        long startTime = System.currentTimeMillis();
//        forkJoinService1.init();
        System.out.println("执行耗时:"+ (System.currentTimeMillis() - startTime));
    }

    @Test
    public void test1(){
        System.out.println("aaa");
    }
}
