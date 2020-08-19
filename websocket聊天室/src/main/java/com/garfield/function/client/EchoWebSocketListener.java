package com.garfield.function.client;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

/**
 * @author jingliyuan
 * @date 2020/8/12
 */
@Slf4j
public class EchoWebSocketListener extends WebSocketListener {
    @Override
    public void onOpen(WebSocket webSocket, Response response) {
//        onMessage(webSocket,"客户端发送消息");
        System.out.println("连接成功");
    }

    @Override
    public void onMessage(WebSocket webSocket, String text){
        System.out.println("client收到消息:"+text);
    }


    @Override
    public void onClosing(WebSocket webSocket, int code, String reason) {
        onMessage(webSocket,"客户端正在关闭");
    }

    @Override
    public void onClosed(WebSocket webSocket, int code, String reason) {
//        onMessage(webSocket,"客户端已关闭");
    }

    @Override
    public void onFailure(WebSocket webSocket, Throwable t, Response response) {
        onMessage(webSocket,"出错啦");
    }

}
