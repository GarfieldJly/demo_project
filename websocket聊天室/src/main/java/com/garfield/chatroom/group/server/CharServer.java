package com.garfield.chatroom.group.server;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.garfield.chatroom.constant.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint("/websocket/groupchar/{id}")
@RestController
@Slf4j
public class CharServer {
    // 用来记录当前连接数的变量
    private static volatile int onlineCount = 0;

    // concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象
    //它是线程安全的无序的集合，可以将它理解成线程安全的HashSet
    public static CopyOnWriteArraySet<CharServer> webSocketSet = new CopyOnWriteArraySet<>();

    public static ConcurrentHashMap<Integer, Session> webSocketMap = new ConcurrentHashMap<>();


    // 与某个客户端的连接会话，需要通过它来与客户端进行数据收发
    private Session session;

    private Integer id;

    private static List<Integer> groupIdList1 = new ArrayList();
    private static List<Integer> groupIdList2 = new ArrayList();
    public static ConcurrentHashMap<Integer, List<Integer>> groupWebSocketMap = new ConcurrentHashMap<>();

    static {
        groupIdList1.add(1);
        groupIdList1.add(2);
        groupIdList1.add(3);

        groupIdList2.add(2);
        groupIdList2.add(3);

        groupWebSocketMap.put(1, groupIdList1);
        groupWebSocketMap.put(2, groupIdList2);
    }

    @OnOpen
    public void onOpen(Session session, @PathParam("id") Integer id) throws Exception {
        if (Constants.idSet.contains(id)) {
            this.session = session;
            System.out.println(this.session.getId());
            this.id = id;
            webSocketSet.add(this);
            log.info("Open a websocket. id={}", id);
            //鉴权通过
//            sendMessage("hello websocket");
            webSocketMap.put(id, session);
        } else {
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

        int groupId = jsonNode.get("groupId").asInt();
        int id = jsonNode.get("id").asInt();
        List<Integer> groupIdList = groupWebSocketMap.get(groupId);
        if (!CollectionUtils.isEmpty(groupIdList)) {
            for (int i = 0; i < groupIdList.size(); i++) {
                Session toClient = webSocketMap.get(groupIdList.get(i));
                //群发消息
                if (toClient != null) {
                    log.info("服务端转发消息");
                    toClient.getBasicRemote().sendText(jsonNode.get("message").asText());
                }
            }
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

