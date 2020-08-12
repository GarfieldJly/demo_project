package com.garfield.testthread.jmm;

import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2020/8/12
 * jvm 的内存模型 jmm(java memory model)
 */
public class TestJmm {
    //1.这种情况会死锁，thread 里多次获取到 flag的值为true,可能会重排序，不再获取flag值，造成死锁
    private  boolean flag = true;
    //2. volatile 1.可见性 2.禁止重排序，所以加上后不会死锁
//    private  volatile boolean flag = true;
    public static void main(String[] args) throws InterruptedException {
        TestJmm testJmm = new TestJmm();
        testJmm.testCache();
    }

    /**
     * 测试重排序
     */
    private void testCache() throws InterruptedException {
        Thread thread = new Thread(() ->{
            int i = 0;
            while (flag){
                //加锁也可以避免死锁
                //加锁和解锁是同步的，放到外面循环完后还没解锁，还是会死锁
                synchronized (this){
                    i++;
                }
            }
            System.out.println("thread 中 i 的值是："+i);
        });
        thread.start();

        TimeUnit.SECONDS.sleep(2);
        flag = false;
    }
}
