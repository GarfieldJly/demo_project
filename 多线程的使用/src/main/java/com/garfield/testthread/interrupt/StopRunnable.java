package com.garfield.testthread.interrupt;

public class StopRunnable implements Runnable {
    int i,j;
    @Override
    public void run() {
        synchronized (StopRunnable.class){
            i++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            j++;
        }
    }

    public void compareValue(){
        System.out.println("i 的值为 : " + i);
        System.out.println("j 的值为 : " + j);
    }
}
