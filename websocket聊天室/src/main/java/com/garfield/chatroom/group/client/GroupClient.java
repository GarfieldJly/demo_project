package com.garfield.chatroom.group.client;


import com.garfield.chatroom.client.EchoWebSocketListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2020/8/12
 * 客户端
 */
public class GroupClient {
    public static void main(String[] args) {
        List<CharClient> charClientList = new ArrayList();
        charClientList.add(new CharClient1());
        charClientList.add(new CharClient2());
        charClientList.add(new CharClient3());




    }
}
