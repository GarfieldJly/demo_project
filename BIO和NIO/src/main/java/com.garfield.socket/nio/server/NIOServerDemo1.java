package com.garfield.socket.nio.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author jingliyuan
 * @date 2020/8/25
 */
public class NIOServerDemo1 {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //设置为非阻塞的
        serverSocketChannel.configureBlocking(false);

        serverSocketChannel.socket().bind(new InetSocketAddress(8080));

        while (true) {
            //收到新的连接
            SocketChannel socketChannel = serverSocketChannel.accept();
            //设置为非阻塞的
            if(socketChannel != null){
                System.out.println("收到新连接 : " + socketChannel.getRemoteAddress());
                socketChannel.configureBlocking(false);
                ByteBuffer requestByteBuffer = ByteBuffer.allocate(1024);
                while (socketChannel.isOpen() && socketChannel.read(requestByteBuffer) != -1) {
                    if (requestByteBuffer.position() >= 0) {
                        break;
                    }
                }
                if (requestByteBuffer.position() == 0) {
                    // 如果没数据了, 则不继续后面的处理
                    continue;
                }
                //改为读取模式
                requestByteBuffer.flip();
                byte[] contentByte = new byte[requestByteBuffer.limit()];
                requestByteBuffer.get(contentByte);
                System.out.println(contentByte);
                System.out.println("收到消息，来自:" + socketChannel.getRemoteAddress());

                // 响应结果 200
                String response = "HTTP/1.1 200 OK\r\n" +
                        "Content-Length: 11\r\n\r\n" +
                        "Hello World";
                ByteBuffer responseByteBuffer = ByteBuffer.wrap(response.getBytes());
                while (responseByteBuffer.hasRemaining()) {
                    //非阻塞
                    socketChannel.write(responseByteBuffer);
                }
            }
        }


    }
}
