package com.example.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

/**
 * @author castle
 */
public class Client {
    public static void main(String[] args) {
        try {
            SocketChannel channel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 9999));
            channel.configureBlocking(false);
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("请输入：");
                String msg = scanner.nextLine();
                byteBuffer.put(msg.getBytes());
                byteBuffer.flip();
                channel.write(byteBuffer);
                byteBuffer.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
