package com.garfield.function.aqs;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author jingliyuan
 * @date 2020/8/20
 */
public class CustomReentrantReadWriteLock {
    private GarfieldAqs garfieldAqs = new GarfieldAqs() {
        //写锁用到的
        //写锁 申请资源时候判断是否有读锁，如果没有就cas设置owner，如果有就阻塞
        //写锁 是否获取资源时候就cas设置owner
        @Override
        public boolean tryAcquire() {
            if (getState().get() == 0) {
                return getOwner().compareAndSet(null, Thread.currentThread());
            }
            return false;
        }

        @Override
        public boolean tryRelease() {
            return getOwner().compareAndSet(Thread.currentThread(), null);
        }

        //读锁用到的
        //读锁 加锁时如果有写锁且owner不是当前线程，加锁失败阻塞，否则state自增，加锁成功
        @Override
        public boolean tryAcquireShared() {
            if (getOwner().get() != null && !getOwner().get().equals(Thread.currentThread())) {
                return false;
            }
            getState().incrementAndGet();
            return true;
        }

        //读锁 解锁时state减1
        @Override
        public boolean tryReleaseShared() {
            return getState().decrementAndGet() > 0;
        }
    };

    public Lock readLock() {
        return new Lock() {
            @Override
            public void lock() {
                garfieldAqs.acquireShared();
            }

            @Override
            public void lockInterruptibly() throws InterruptedException {

            }

            @Override
            public boolean tryLock() {
                return false;
            }

            @Override
            public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
                return false;
            }

            @Override
            public void unlock() {
                garfieldAqs.releaseShared();
            }

            @Override
            public Condition newCondition() {
                return null;
            }
        };
    }

    public Lock writeLock() {
        return new Lock() {
            @Override
            public void lock() {
                garfieldAqs.acquire();
            }

            @Override
            public void lockInterruptibly() throws InterruptedException {

            }

            @Override
            public boolean tryLock() {
                return false;
            }

            @Override
            public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
                return false;
            }

            @Override
            public void unlock() {
                garfieldAqs.release();
            }

            @Override
            public Condition newCondition() {
                return null;
            }
        };
    }


    private void testWrite(Thread thread) {
        garfieldAqs.acquire();
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 1) {
            System.out.println(thread.getName() + "开始写数据");
        }
        garfieldAqs.release();
        System.out.println(thread.getName() + "结束写数据");
    }

    private void testRead(Thread thread) {
        garfieldAqs.acquireShared();
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 1) {
            System.out.println(thread.getName() + "开始读数据");
        }
        garfieldAqs.releaseShared();
        System.out.println(thread.getName() + "结束读数据");
    }

    public static void main(String[] args) {
        CustomReentrantReadWriteLock customReentrantReadWriteLock = new CustomReentrantReadWriteLock();
        Thread thread1 = new Thread(() -> {
            customReentrantReadWriteLock.testRead(Thread.currentThread());
        });
        Thread thread2 = new Thread(() -> {
            customReentrantReadWriteLock.testRead(Thread.currentThread());
        });
        Thread thread3 = new Thread(() -> {
            customReentrantReadWriteLock.testWrite(Thread.currentThread());
        });
        //执行结果：
        //thread0 和thread1 交叉读数据，读完数据后thread2开始写数据
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
