package com.garfield.function.config;

import org.springframework.core.task.AsyncTaskExecutor;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/**
 * @author jingliyuan
 * @date 2021/2/2
 * 可以处理异常异步任务
 */
public class ExceptionHandlingAsyncTaskExecutor implements AsyncTaskExecutor {
    private AsyncTaskExecutor asyncTaskExecutor;

    public ExceptionHandlingAsyncTaskExecutor(AsyncTaskExecutor asyncTaskExecutor) {
        this.asyncTaskExecutor = asyncTaskExecutor;
    }

    @Override
    public void execute(Runnable runnable, long l) {
        asyncTaskExecutor.execute(createWrappedRunnable(runnable),l);
    }

    @Override
    public Future<?> submit(Runnable runnable) {
        return asyncTaskExecutor.submit(runnable);
    }

    @Override
    public <T> Future<T> submit(Callable<T> callable) {
        return asyncTaskExecutor.submit(createWrappedCallable(callable));
    }

    @Override
    public void execute(Runnable runnable) {
        asyncTaskExecutor.execute(createWrappedRunnable(runnable));
    }

    private Runnable createWrappedRunnable(Runnable runnable){
        return () -> {
            try{
                runnable.run();
            }catch (Exception e){
                handle(e);
            }

        };
    }

    private Callable createWrappedCallable(Callable callable){
        return new Callable() {
            @Override
            public Object call() throws Exception {
                try{
                    return callable.call();
                }catch (Exception e){
                    handle(e);
                    return null;
                }
            }
        };
    }

    private void handle(Exception e){
        System.out.println("抛异常: "+e.getMessage());
    }
}
