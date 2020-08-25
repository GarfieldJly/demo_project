package com.garfield.socket.bio.client;

import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2020/8/24
 */
public class ClientDemo2 {
    public static void main(String[] args)  {
        //join() 方法让一个线程强制运行
        //yield()让出资源

//        try {
//            //休眠2秒，休眠时间更加清晰
//            TimeUnit.SECONDS.sleep(2);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            //休眠2秒，时间不太好看出来
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        ClientDemo2 clientDemo2 = new ClientDemo2();
        Thread thread = new Thread(() -> {
            clientDemo2.work();
        });

        try {
            TimeUnit.SECONDS.timedJoin(thread,10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public  synchronized  void work() {
        System.out.println("Begin Work");
        try {
            //等待30秒后，自动唤醒继续执行
            TimeUnit.SECONDS.timedWait(this, 30);
            //wait(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work End");
    }

}
