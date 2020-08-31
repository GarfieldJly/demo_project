package com.garfield.forkjoinpool.bean;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jingliyuan
 * @date 2020/8/31
 */
public class NumberBo extends RecursiveTask<Integer> {
    private final static int SEPARATE = 10000;
    private int start;
    private int end;
    private int sum;

    public NumberBo(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if((end - start) <= SEPARATE){
            for (int i = start; i <= end ; i++) {
                sum += i;
            }
            return sum;
        }
        int x = (start + end) / 3;
        NumberBo numberBo1  = new NumberBo(start,x);
        numberBo1.fork();

        NumberBo numberBo2  = new NumberBo(x+1,x*2);
        numberBo2.fork();

        NumberBo numberBo3  = new NumberBo(x*2 + 1,end);
        numberBo3.fork();

        sum = numberBo1.join() + numberBo2.join() + numberBo3.join();
        return sum;
    }
}
