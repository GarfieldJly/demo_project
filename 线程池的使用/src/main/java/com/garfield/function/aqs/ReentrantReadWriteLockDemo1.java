package com.garfield.function.aqs;

/**
 * @author jingliyuan
 * @date 2020/8/20
 */
public class ReentrantReadWriteLockDemo1 {

    private CustomReadLock readLock = new CustomReadLock();
    private CustomWriteLock writeLock = new CustomWriteLock();

    private void testRead(Thread thread){
        readLock.lock();
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 1){
            System.out.println(thread.getName() + "开始读取数据");
        }
        readLock.unlock();
        System.out.println(thread.getName() + "结束读取数据");
    }

    private void testWrite(Thread thread){
        writeLock.lock();
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 1){
            System.out.println(thread.getName() + "开始写数据");
        }
        writeLock.unlock();
        System.out.println(thread.getName() + "结束写数据");
    }

    public static void main(String[] args) {
        ReentrantReadWriteLockDemo1 readWriteLockDemo1 = new ReentrantReadWriteLockDemo1();
        Thread thread1 = new Thread(() ->{
            readWriteLockDemo1.testRead(Thread.currentThread());
        });
        Thread thread2 = new Thread(() ->{
            readWriteLockDemo1.testRead(Thread.currentThread());
        });
        Thread thread3 = new Thread(() ->{
            readWriteLockDemo1.testWrite(Thread.currentThread());
        });
        //执行结果：
        //thread0 和thread1 交叉读数据，读完数据后thread2开始写数据
        thread1.start();
        thread2.start();
        thread3.start();

    }

}
