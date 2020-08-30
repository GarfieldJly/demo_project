package com.garfield.forkjoinpool;

import com.garfield.forkjoinpool.service.ForkJoinService1;
import com.garfield.forkjoinpool.service.ForkJoinService2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutionException;

/**
 * @author jingliyuan
 * @date 2020/8/29
 */
//测试运行环境
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {
    @Before
    public void before(){
        System.out.println("开始测试");
    }
    @After
    public void after(){
        System.out.println("结束测试");
    }
    @Autowired
    private ForkJoinService1 forkJoinService1;
    @Test
    public void testForkJoinService1(){
        long startTime = System.currentTimeMillis();
        forkJoinService1.init();
        System.out.println("执行耗时:"+ (System.currentTimeMillis() - startTime)+"毫秒");
    }

    @Autowired
    private ForkJoinService2 forkJoinService2;
    @Test
    public void testForkJoinService2(){
        long startTime = System.currentTimeMillis();
        try {
            forkJoinService2.init();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行耗时:"+ (System.currentTimeMillis() - startTime)+"毫秒");
    }
}
