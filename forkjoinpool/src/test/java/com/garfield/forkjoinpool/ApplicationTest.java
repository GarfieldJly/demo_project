package com.garfield.forkjoinpool;

import com.alibaba.fastjson.JSONObject;
import com.garfield.forkjoinpool.service.*;
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
        //执行时间为两个接口请求时间之和
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

    @Autowired
    private CountDownLatchService3 countDownLatchService3;
    @Test
    public void testCountDownLatchService3(){
        long startTime = System.currentTimeMillis();
        try {
            countDownLatchService3.init();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行耗时:"+ (System.currentTimeMillis() - startTime)+"毫秒");
    }

    @Autowired
    private FutureTaskService4 futureTaskService4;
    @Test
    public void testFutureTaskService4(){
        long startTime = System.currentTimeMillis();
        try {
            futureTaskService4.init();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("执行耗时:"+ (System.currentTimeMillis() - startTime)+"毫秒");
    }

    @Autowired
    private FutureTaskService5 futureTaskService5;
    @Test
    public void testFutureTaskService5(){
        long startTime = System.currentTimeMillis();
        try {
            futureTaskService5.init();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("执行耗时:"+ (System.currentTimeMillis() - startTime)+"毫秒");
    }

    @Autowired
    private ForkJoinService3 forkJoinService3;
    @Test
    public void testForkJoinService3(){
        long startTime = System.currentTimeMillis();

        int sum = forkJoinService3.getSum();
        System.out.println("1到30000的和为:"+sum);

        System.out.println("执行耗时:"+ (System.currentTimeMillis() - startTime)+"毫秒");
    }
}
