package com.garfield.socket.bio.client;


import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author jingliyuan
 * @date 2020/8/12
 * 客户端
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("localhost",8080);
        OutputStream outputStream = clientSocket.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        outputStream.write(scanner.nextLine().getBytes());
        scanner.close();
        outputStream.close();
        clientSocket.close();

    }
}
