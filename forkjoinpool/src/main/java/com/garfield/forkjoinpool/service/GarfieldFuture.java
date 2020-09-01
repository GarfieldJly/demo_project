package com.garfield.forkjoinpool.service;

import java.util.Iterator;
import java.util.concurrent.*;
import java.util.concurrent.locks.LockSupport;

/**
 * @author jingliyuan
 * @date 2020/8/31
 * 自定义Future,获取异步计算的结果
 */
public class GarfieldFuture<T> implements Future<T>,Runnable {
    private T result;
    //状态
    private String state;
    private LinkedBlockingQueue<Thread> queue = new LinkedBlockingQueue<>();
    private Callable<T> callable;

    public GarfieldFuture(Callable callable) {
        this.callable = callable;
    }
    @Override
    public void run(){
        try {
            result = callable.call();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            state = "END";
        }
        Thread thread = queue.poll();
        while (thread != null){
            LockSupport.unpark(thread);
            // 继续取出队列中的等待者
            thread = queue.poll();
        }
    }
    @Override
    public T get() throws InterruptedException, ExecutionException {
        if("END".equals(state)){
            return result;
        }
        // 加入到等待队列,线程不继续往下执行
        queue.offer(Thread.currentThread());
        while (!"END".equals(state)){
            //若状态不为END,则挂起
            LockSupport.park();
        }
        // 如果没有结束,那么调用get方法的线程,就应该进入等待
        return result;
    }


    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return false;
    }

    @Override
    public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }


}
