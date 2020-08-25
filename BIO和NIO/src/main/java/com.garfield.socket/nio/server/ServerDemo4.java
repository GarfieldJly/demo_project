package com.garfield.socket.nio.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author jingliyuan
 * @date 2020/8/25
 */
public class ServerDemo4 {
    public static void main(String[] args) throws IOException {
        // 1. 创建网络服务端ServerSocketChannel
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //非阻塞
        serverSocketChannel.configureBlocking(false);
        // 2. 构建一个Selector选择器,并且将channel注册上去
        Selector selector = Selector.open();
        SelectionKey selectionKey = serverSocketChannel.register(selector, 0,serverSocketChannel);
        selectionKey.interestOps(SelectionKey.OP_ACCEPT);
        // 3. 绑定端口
        serverSocketChannel.socket().bind(new InetSocketAddress(8090));

        System.out.println("服务端启动成功");

        while (true){
            // 不再轮询通道,改用下面轮询事件的方式.select方法有阻塞效果,直到有事件通知才会有返回
            selector.select();

            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()){
                SelectionKey key = iterator.next();
                iterator.remove();
                // 关注 Read 和 Accept两个事件
                if(key.isAcceptable()){
                    ServerSocketChannel serverSocketChannel1 = (ServerSocketChannel) key.attachment();
                    SocketChannel socketChannel = serverSocketChannel1.accept();
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector,SelectionKey.OP_READ,socketChannel);
                    System.out.println("收到新的连接:"+socketChannel.getRemoteAddress());
                }
                if(key.isReadable()){
                    //可读
                    SocketChannel socketChannel = (SocketChannel) key.attachment();
                    try{
                        socketChannel.configureBlocking(false);

                        ByteBuffer requestBuffer = ByteBuffer.allocate(1024);
                        while (socketChannel.isOpen() && socketChannel.read(requestBuffer) != -1) {
                            // 长连接情况下,需要手动判断数据有没有读取结束 (此处做一个简单的判断: 超过0字节就认为请求结束了)
                            if (requestBuffer.position() > 0) {break;}
                        }
                        if(requestBuffer.position() == 0){
                            continue;
                        }

                        byte[] requestByte = new byte[requestBuffer.limit()];
                        //改为读取模式
                        requestBuffer.flip();
                        requestBuffer.get(requestByte);
                        System.out.println(String.format("收到来自:%s,消息：%s",socketChannel.getRemoteAddress(),new String(requestByte)));

                        // 响应结果 200
                        String response = "HTTP/1.1 200 OK\r\n" +
                                "Content-Length: 11\r\n\r\n" +
                                "Hello World";
                        ByteBuffer responseByteBuffer = ByteBuffer.wrap(response.getBytes());
                        while (responseByteBuffer.hasRemaining()){
                            socketChannel.write(responseByteBuffer);
                        }
                    }catch (Exception e){
                        // 取消事件订阅
                        key.channel();
                    }

                }
                selector.selectNow();
            }



        }


    }

}
