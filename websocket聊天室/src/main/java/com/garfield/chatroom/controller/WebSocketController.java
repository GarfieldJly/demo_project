//package com.garfield.chatroom.controller;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.websocket.*;
//import javax.websocket.server.PathParam;
//import javax.websocket.server.ServerEndpoint;
//import java.util.concurrent.CopyOnWriteArraySet;
////https://blog.csdn.net/owner_zhou/article/details/89815984
////https://www.cnblogs.com/kiwifly/p/11729304.html
////http://www.websocket-test.com/  websocket 在线测试链接
//@ServerEndpoint("/websocket/{id}/{name}")
//@RestController
//@Slf4j
//public class WebSocketController {
//    // 用来记录当前连接数的变量
//    private static volatile int onlineCount = 0;
//
//    // concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象
//    //它是线程安全的无序的集合，可以将它理解成线程安全的HashSet
//    public static CopyOnWriteArraySet<WebSocketController> webSocketSet = new CopyOnWriteArraySet<>();
//
//    // 与某个客户端的连接会话，需要通过它来与客户端进行数据收发
//    private Session session;
//
//    @OnOpen
//    public void onOpen(Session session, @PathParam("id") long id, @PathParam("name") String name) throws Exception {
//        this.session = session;
//        System.out.println(this.session.getId());
//        webSocketSet.add(this);
//        log.info("Open a websocket. id={}, name={}", id, name);
//
//        sendMessage("hello websocket");
//    }
//
//    @OnClose
//    public void onClose() throws Exception {
//        webSocketSet.remove(this);
//        sendMessage("bye bye");
//        log.info("Close a websocket. ");
//    }
//
//    @OnMessage
//    public void onMessage(String message, Session session) throws Exception {
//        log.info("Receive a message from client: " + message);
//        sendMessage("傻子");
//    }
//
//    @OnError
//    public void onError(Session session, Throwable error) throws Exception {
//        log.error("Error while websocket. ", error);
//        sendMessage("出错啦");
//    }
//
//    public void sendMessage(String message) throws Exception {
//        if (this.session.isOpen()) {
//            this.session.getBasicRemote().sendText(message);
//        }
//    }
//
//    public static synchronized int getOnlineCount() {
//        return onlineCount;
//    }
//
//    public static synchronized void addOnlineCount() {
//        onlineCount++;
//    }
//
//    public static synchronized void subOnlineCount() {
//        onlineCount--;
//    }
//}
//
