package com.garfield.socket.bio.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2020/8/24
 */
public class ServerDemo3 {
    private static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

    public static void main(String[] args) throws IOException {


        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("服务器启动成功");
        while (!serverSocket.isClosed()) {
            Socket request = serverSocket.accept();
            System.out.println("收到新连接：" + request.toString());

            // 多线程接收多个连接
            threadPoolExecutor.submit(
                    () -> {
                        try {
                            InputStream inputStream = request.getInputStream();
                            BufferedReader bufferedReader =
                                    new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
                            String message;
                            while ((message = bufferedReader.readLine()) != null) {
                                if (message.length() == 0) {
                                    break;
                                }
                                // 拿到消息后可以解析消息拿到请求方法，请求数据等内容
                                System.out.println("消息内容为：" + message);
                            }
                            System.out.println("收到数据，来自：" + request.toString());

                            // 根据HTTP协议响应数据包返回数据给浏览器
                            OutputStream outputStream = request.getOutputStream();
                            outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
                            outputStream.write("Content-Length: 11\r\n\r\n".getBytes());
                            outputStream.write("Hello World".getBytes());
                            outputStream.flush();

                        } catch (IOException e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                request.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
        }
        serverSocket.close();
    }


}
