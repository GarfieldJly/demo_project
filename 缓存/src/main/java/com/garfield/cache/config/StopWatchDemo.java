package com.garfield.cache.config;

import org.springframework.util.StopWatch;

import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2020/11/3
 * StopWatch 的用法
 */
public class StopWatchDemo {
    public static void main(String[] args) throws InterruptedException {
        StopWatchDemo stopWatchDemo = new StopWatchDemo();
        stopWatchDemo.test1();

//        stopWatchDemo.test2();
        stopWatchDemo.test3();
    }

    /**
     * 调用 getLastTaskTimeMillis() 方法
     * @throws InterruptedException
     */
    public void test1() throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("喝奶茶");
        TimeUnit.SECONDS.sleep(2);
        stopWatch.stop();
        System.out.println("喝奶茶耗时:" + stopWatch.getLastTaskTimeMillis());

        stopWatch.start("敲代码");
        TimeUnit.SECONDS.sleep(3);
        stopWatch.stop();
        System.out.println("敲代码耗时:" + stopWatch.getLastTaskTimeMillis());

        stopWatch.start("发呆");
        TimeUnit.SECONDS.sleep(1);
        stopWatch.stop();
        System.out.println("发呆耗时:" + stopWatch.getLastTaskTimeMillis());

    }

    /**
     * getTaskInfo() 获取TaskInfo，再调用getTimeMillis() 获得时间
     */
    public void test2() throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("喝奶茶");
        TimeUnit.SECONDS.sleep(2);
        stopWatch.stop();

        stopWatch.start("敲代码");
        TimeUnit.SECONDS.sleep(3);
        stopWatch.stop();

        stopWatch.start("发呆");
        TimeUnit.SECONDS.sleep(1);
        stopWatch.stop();

        StopWatch.TaskInfo[] taskInfo = stopWatch.getTaskInfo();
        System.out.println(taskInfo[0].getTaskName()  +"耗时:" + taskInfo[0].getTimeMillis());
        System.out.println(taskInfo[1].getTaskName()  +"耗时:" + taskInfo[1].getTimeMillis());
        System.out.println(taskInfo[2].getTaskName()  +"耗时:" + taskInfo[2].getTimeMillis());
    }

    //com.google.common.base.Stopwatch类
    public void test3() throws InterruptedException {
        com.google.common.base.Stopwatch stopWatch = com.google.common.base.Stopwatch.createStarted();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("喝奶茶耗时:" + stopWatch.stop());

        stopWatch.reset().start();
        TimeUnit.SECONDS.sleep(3);
        System.out.println("敲代码耗时:" + stopWatch.stop());

        stopWatch.reset().start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("发呆耗时:" + stopWatch.stop());
    }



}
