package com.garfield.socket.bio.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ServerDemo2 {
    public static void main(String[] args) throws IOException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10 ,5 ,TimeUnit.SECONDS ,new LinkedBlockingDeque<>());
        ServerSocket serverSocket = new ServerSocket(8080);
       while (!serverSocket.isClosed()){
           Socket socket = serverSocket.accept();
           System.out.println("收到新连接:"+socket.toString());
           threadPoolExecutor.execute(() ->{
               try {
                   InputStream inputStream = socket.getInputStream();
                   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"utf-8"));
                   String message ;
                   while ((message = bufferedReader.readLine()) != null ){
                       if(message.length() == 0){
                           break;
                       }
                       System.out.println("收到"+socket.getPort()+"的消息:"+message);
                   }
                   bufferedReader.close();
                   inputStream.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }

           });
       }
        serverSocket.close();

    }
}

