package com.garfield.socket.bio.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
       while (!serverSocket.isClosed()){
           Socket socket = serverSocket.accept();
           InputStream inputStream = socket.getInputStream();
           BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"utf-8"));
           String message ;
           while ((message = bufferedReader.readLine()) != null ){
               System.out.println("收到"+socket.getPort()+"的消息:"+message);
           }
           bufferedReader.close();
           inputStream.close();
       }
        serverSocket.close();

    }
}

