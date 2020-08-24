package com.garfield.socket.nio;

import java.nio.ByteBuffer;

/**
 * @author jingliyuan
 * @date 2020/8/24
 */
public class ByteBufferDemo1 {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byte b[] = new byte[]{'a','b','c'};
        byteBuffer.put(b[0]);
        byteBuffer.put(b[1]);
        byteBuffer.put(b[2]);
        System.out.println(String.format("写入模式下，byteBuffer的capacity是:%s ;position是: %s ;;limit是: %s",byteBuffer.capacity() , byteBuffer.position(),byteBuffer.limit()));

        //改为读取模式
        byteBuffer.flip();
        byte a = byteBuffer.get();
        System.out.println(a);
        byte bb = byteBuffer.get();
        System.out.println(bb);
//        byte c = byteBuffer.get();
//        System.out.println(c);
        System.out.println(String.format("读取模式下，byteBuffer的capacity是:%s ;position是: %s ;;limit是: %s",byteBuffer.capacity() , byteBuffer.position(),byteBuffer.limit()));
        //清空已读的缓冲区
        byteBuffer.compact();

        byteBuffer.put((byte) 1);
        byteBuffer.put((byte) 2);

        System.out.println(String.format("最终的情况，capacity容量：%s, position位置：%s, limit限制：%s", byteBuffer.capacity(),
                byteBuffer.position(), byteBuffer.limit()));

    }
}
