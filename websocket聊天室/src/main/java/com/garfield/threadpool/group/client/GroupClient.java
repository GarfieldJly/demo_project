package com.garfield.threadpool.group.client;


import java.util.ArrayList;
import java.util.List;

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
