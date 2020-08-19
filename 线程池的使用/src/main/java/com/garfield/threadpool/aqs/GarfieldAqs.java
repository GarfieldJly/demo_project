package com.garfield.threadpool.aqs;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/**
 * @author jingliyuan
 * @date 2020/8/19
 */
public class GarfieldAqs  {
    private AtomicReference<Thread> owner;
    private LinkedBlockingQueue<Thread> waiter = new LinkedBlockingQueue();
    //独占接口
    public void acquire(){
        boolean flag = true;
        while (!tryAcquire()){
            if(flag){
                waiter.offer(Thread.currentThread());
                flag = false;
            }
            //挂起
            LockSupport.park();
        }
        waiter.remove(Thread.currentThread());
    }

    public void release(){
        if(tryRelease()){
            //waiter 清空
            Iterator<Thread> iterator = waiter.iterator();
            while (iterator.hasNext()){
                //线程唤醒
                LockSupport.unpark(iterator.next());

            }
        }
    }

    /**
     * 实际执行资源获取的操作
     */
    public boolean tryAcquire(){
       throw new UnsupportedOperationException();
    }

    /**
     * 实际执行资源释放的操作
     */
    public boolean tryRelease(){
        throw new UnsupportedOperationException();
    }

    //共享资源接口
    public void acquireShared(){

    }

    public void releaseShared(){

    }

    public void tryAcquireShared(){

    }

    public void tryReleaseShared(){

    }

}
