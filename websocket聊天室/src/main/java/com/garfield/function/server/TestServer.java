package com.garfield.function.server;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.garfield.function.constant.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
@ServerEndpoint("/websocket/{id}")
@RestController
@Slf4j
public class TestServer {
    // 用来记录当前连接数的变量
    private static volatile int onlineCount = 0;

    // concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象
    //它是线程安全的无序的集合，可以将它理解成线程安全的HashSet
    public static CopyOnWriteArraySet<TestServer> webSocketSet = new CopyOnWriteArraySet<>();

    public static ConcurrentHashMap<Integer,Session> webSocketMap = new ConcurrentHashMap<>();

    // 与某个客户端的连接会话，需要通过它来与客户端进行数据收发
    private Session session;

    private Integer id;

    @OnOpen
    public void onOpen(Session session, @PathParam("id") Integer id) throws Exception {
        if(Constants.idSet.contains(id)){
            this.session = session;
            System.out.println(this.session.getId());
            this.id = id;
            webSocketSet.add(this);
            log.info("Open a websocket. id={}", id);
            //鉴权通过
//            sendMessage("hello websocket");
            webSocketMap.put(id,session);
        }else{
            sendMessage("不合法的连接");
        }
    }

    @OnClose
    public void onClose() throws Exception {
        webSocketSet.remove(this);
        webSocketMap.remove(id);
        sendMessage("bye bye");
        log.info("Close a websocket. ");
    }

    @OnMessage
    public void onMessage(String message, Session session) throws Exception {
        log.info("Receive a message from client: " + message);
        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNode = objectMapper.readTree(message);

        Session toClient = webSocketMap.get(jsonNode.get("id").asInt());
        if (toClient!=null){
            toClient.getBasicRemote().sendText(jsonNode.get("message").asText());
        }
    }

    public void onError(Session session, Throwable error) throws Exception {
        log.error("Error while websocket. ", error);
        sendMessage("出错啦");
    }

    public void sendMessage(String message) throws Exception {
        if (this.session.isOpen()) {
            this.session.getBasicRemote().sendText(message);
        }
    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        onlineCount--;
    }
}

