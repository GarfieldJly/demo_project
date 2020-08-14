package com.garfield.testthread.atomicity;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/**
 * @author jingliyuan
 * @date 2020/8/13
 */
public class TestAtomic2 {

    public static void main(String[] args) {
//        testAtomicLong();

        testAtomicLongArray();
    }

    /**
     * AtomicLong AtomicLong是作用是对长整形进行原子操作。在32位操作系统中，64位的long 和 double
     * 变量由于会被JVM当作两个分离的32位来进行操作，所以不具有原子性。
     * 而使用AtomicLong能让long的操作保持原子型。
     */
    private static void testAtomicLong(){
        AtomicLong atomicLong1 = new AtomicLong();
        long add = atomicLong1.incrementAndGet();
        long delete = atomicLong1.decrementAndGet();

        // 创建值为initialValue的AtomicLong对象
        AtomicLong atomicLong2 = new AtomicLong(10);
        //以原子方式将当前值减 1，并返回减1后的值。等价于“--num”
//        long decrement1 = atomicLong2.decrementAndGet();
        //以原子方式将当前值减 1，并返回减1前的值。等价于“num--”
//        long decrement2 = atomicLong2.getAndDecrement();
//        System.out.println("decrement1 的值:" + decrement1);
//        System.out.println("decrement2 的值:" + decrement2);
        //// 以原子方式将当前值加 1，并返回加1后的值。等价于“++num”
        long increment1 = atomicLong2.incrementAndGet();
        // 以原子方式将当前值加 1，并返回加1前的值。等价于“num++”
        long increment2 = atomicLong2.getAndIncrement();
        System.out.println("increment1 的值:"+increment1);
        System.out.println("increment2 的值:"+increment2);
        //如果当前值 == expect，则以原子方式将该值设置为update。成功返回true，否则返回false，并且不修改原值
        boolean flag = atomicLong2.compareAndSet(10, 11);
        System.out.println("对比后的结果:"+flag);
    }

    private static void testAtomicLongArray(){
        AtomicLongArray atomicLongArray = new AtomicLongArray(10);
        // 将位置 i 的元素设置为给定值。
        atomicLongArray.set(0,10);
        atomicLongArray.set(1,100);
        atomicLongArray.set(2,200);
        atomicLongArray.set(3,300);

        long value = atomicLongArray.get(2);
        System.out.println("下标为2的值为:"+value);
        // 以原子方式将索引 i 的元素加1。
        long value2 = atomicLongArray.incrementAndGet(0);
        System.out.println("下标为0的值为:"+value2);

    }
}
