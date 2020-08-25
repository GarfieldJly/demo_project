package com.garfield.socket.nio.client;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class NIOClientDemo2 {

    public static void main(String[] args) throws Exception {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);

        // 2. 构建一个Selector选择器,并且将channel注册上去
        Selector selector = Selector.open();
        SelectionKey selectionKey = socketChannel.register(selector, 0,socketChannel);
        selectionKey.interestOps(SelectionKey.OP_CONNECT);
        socketChannel.connect(new InetSocketAddress("127.0.0.1", 8090));

        while (true) {
            // 不再轮询通道,改用下面轮询事件的方式.select方法有阻塞效果,直到有事件通知才会有返回
            selector.select();

            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                iterator.remove();
                // 关注 Read 和 Accept两个事件
                if (key.isConnectable()) {
                    SocketChannel channel = (SocketChannel) key.attachment();
                    channel.configureBlocking(false);
                    channel.register(selector, SelectionKey.OP_WRITE, channel);
                    System.out.println("收到新的连接:" + channel.getRemoteAddress());
                }
                if (key.isWritable()) {

                    //可读
                    SocketChannel attachment = (SocketChannel) key.attachment();
                    attachment.configureBlocking(false);
                    Scanner scanner = new Scanner(System.in);
                    String msg = scanner.nextLine();
                    ByteBuffer byteBuffer = ByteBuffer.wrap(msg.getBytes());
                    while (byteBuffer.hasRemaining()) {
                        //发送请求数据
                        attachment.write(byteBuffer);
                    }

                    // 读取响应
                    System.out.println("收到服务端响应:");
                    ByteBuffer serverByteBuffer = ByteBuffer.allocate(1024);
                    while (attachment.isOpen() && attachment.read(serverByteBuffer) != -1) {
                        // 长连接情况下,需要手动判断数据有没有读取结束 (此处做一个简单的判断: 超过0字节就认为请求结束了)
                        if (serverByteBuffer.position() > 0) {
                            break;
                        }
                    }
                    serverByteBuffer.flip();
                    byte[] serverByte = new byte[serverByteBuffer.limit()];
                    serverByteBuffer.get(serverByte);
                    System.out.println(new String(serverByte));
                    scanner.close();


                }
                selector.selectNow();
            }

        }
    }

}
