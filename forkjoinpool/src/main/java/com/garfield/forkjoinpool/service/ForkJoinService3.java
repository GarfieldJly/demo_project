package com.garfield.forkjoinpool.service;

import com.garfield.forkjoinpool.bean.NumberBo;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @author jingliyuan
 * @date 2020/8/29
 * 改成ForkJoinPool，并发的http请求
 */
@Service
public class ForkJoinService3 {
    private int sum;
    /**
     * 计算从1加到30000的和
     */
    public int getSum()  {
        ForkJoinPool forkJoinPool = new ForkJoinPool(3);
        ForkJoinTask<Integer> submit = forkJoinPool.submit(new NumberBo(1, 30000));
        try {
            sum = submit.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            return sum;
        }

    }

}
