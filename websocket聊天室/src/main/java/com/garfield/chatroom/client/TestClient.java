package com.garfield.chatroom.client;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketHttpHeaders;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.client.WebSocketClient;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2020/8/12
 * 客户端
 */
public class TestClient {
    public static void main(String[] args) throws URISyntaxException {

        OkHttpClient mOkHttpClient = new OkHttpClient.Builder()
                .readTimeout(3, TimeUnit.SECONDS)//设置读取超时时间
                .writeTimeout(3, TimeUnit.SECONDS)//设置写的超时时间
                .connectTimeout(3, TimeUnit.SECONDS)//设置连接超时时间
                .build();

        Request request = new Request.Builder().url("ws://localhost:8080/websocket/1").build();
        EchoWebSocketListener socketListener = new EchoWebSocketListener();
        WebSocket webSocket = mOkHttpClient.newWebSocket(request, socketListener);
//        mOkHttpClient.dispatcher().executorService().shutdown();


        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while (!":q".equals(text)){
            String json = "{\"id\":2,\"message\":\""+text+"\"}";
            webSocket.send(json);
            text = scanner.nextLine();
        }
        webSocket.close(1000,"客户端1下线了...");

    }
}
