package com.garfield.socket.nio.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

/**
 * @author jingliyuan
 * @date 2020/8/25
 */
public class NIOClientDemo1 {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.connect(new InetSocketAddress("127.0.0.1", 8080));
        while (!socketChannel.finishConnect()) {
            Scanner scanner = new Scanner(System.in);
            String msg = scanner.nextLine();
            ByteBuffer byteBuffer = ByteBuffer.wrap(msg.getBytes());
            while (byteBuffer.hasRemaining()){
                //发送请求数据
                socketChannel.write(byteBuffer);
            }

            // 读取响应
            System.out.println("收到服务端响应:");
            ByteBuffer serverByteBuffer = ByteBuffer.allocate(1024);
            while (socketChannel.isOpen() && socketChannel.read(serverByteBuffer) != -1) {
                // 长连接情况下,需要手动判断数据有没有读取结束 (此处做一个简单的判断: 超过0字节就认为请求结束了)
                if (serverByteBuffer.position() > 0){
                    break;
                }
            }
            serverByteBuffer.flip();
            byte[] serverByte = new byte[serverByteBuffer.limit()];
            serverByteBuffer.get(serverByte);
            System.out.println(new String(serverByte));
            scanner.close();
            socketChannel.close();
        }

    }
}
