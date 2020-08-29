package com.garfield.socket.channel;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author jingliyuan
 * @date 2020/8/28
 * 读取文件
 */
public class FileChannelDemo {
    public static void main(String[] args) throws IOException {
        File springConfigFile = new File("H:\\demo_project\\spring.txt");
        FileInputStream fileInputStream = new FileInputStream(springConfigFile);
        FileChannel fileChannel =  fileInputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        while (fileChannel.read(byteBuffer) != -1){
            byteBuffer.flip();
            byte[] bytes = new byte[byteBuffer.limit()];
            byteBuffer.get(bytes);
            byteBuffer.clear();
            System.out.println("读取的内容: "+new java.lang.String(bytes));
        }

    }
}
