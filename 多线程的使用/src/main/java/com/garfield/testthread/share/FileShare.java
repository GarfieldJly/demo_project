package com.garfield.testthread.share;

/**
 *  变量的共享
 */
public class FileShare {
    private static String content = "garfield";

    public static void main(String[] args) {
        Thread writeThread = new Thread(() -> {
            int i = 0 ;
            while (true){
                i++;
                content = "blue cat " + i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        writeThread.start();

        boolean flag = true;
        while (flag){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("content的值 : " + content);

            if("blue cat 10".equals(content)){
                flag = false;
                writeThread.interrupt();
            }
        }
    }
}
