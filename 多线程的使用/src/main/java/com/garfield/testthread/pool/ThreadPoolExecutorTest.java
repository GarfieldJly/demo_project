package com.garfield.testthread.pool;

import java.util.concurrent.*;

/***
 * 线程池的用法，随意写一个接口，这个接口里你需要调用其他服务的地址，
 * 调用时间可能很长，所以用线程池来异步调用
 */
public class ThreadPoolExecutorTest {

    //TODO 自定义线程池
    static ExecutorService threadPool = new ThreadPoolExecutor(5,10,5,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());

    public static void main(String[] args) {
        test();
        test();
        test();
    }


    public static void test(){
        Future<String> submit = threadPool.submit(() -> {
            //模拟一个请求很耗时的接口
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "获取到的接口返回值";
        });
        String result = null;
        try {
            //修改超时时间
            //线程池异步执行任务，获取线程的返回值
            //Future.get()可以获得操作的结果，如果异步操作还没有完成，则，get()会使当前线程阻塞。
//            result = submit.get();
            //超过任务的执行时间即可
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0,Integer.MAX_VALUE,5,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
            threadPoolExecutor.submit(() ->{

            });
            result = submit.get(6000, TimeUnit.MILLISECONDS);

        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
