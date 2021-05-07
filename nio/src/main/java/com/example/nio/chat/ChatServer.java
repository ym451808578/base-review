package com.example.nio.chat;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;

/**
 * @author Castle
 * @Date 2021/5/7 9:45
 */
public class ChatServer {
    private ServerSocketChannel serverSocketChannel;
    private Selector selector;
    private static final int PORT = 9999;


    public ChatServer() {
        try {
            serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.bind(new InetSocketAddress(PORT));
            selector = Selector.open();
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("*******服务端已就绪********");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listen() {
        System.out.println("进行监听的线程：" + Thread.currentThread().getName());
        try {
            while (selector.select() > 0) {
                System.out.println("***********开始轮询**********");
                Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()) {
                    SelectionKey selectionKey = iterator.next();
                    if (selectionKey.isAcceptable()) {
                        SocketChannel channel = serverSocketChannel.accept();
                        channel.configureBlocking(false);
                        System.out.println(channel.getRemoteAddress() + "上线");
                        channel.register(selector, SelectionKey.OP_READ);
                    } else if (selectionKey.isReadable()) {
                        readMsg(selectionKey);
                    }
                    iterator.remove();
                }
            }
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    private void readMsg(SelectionKey selectionKey) {
        SocketChannel channel = (SocketChannel) selectionKey.channel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        int len;
        try {
            while ((len = channel.read(byteBuffer)) > 0) {
                System.out.println(len);
                byteBuffer.flip();
                String msg = new String(byteBuffer.array(), 0, len);
                System.out.println("收到来自客户端的消息：" + msg);
                byteBuffer.clear();
                sendMsgToClient(msg, channel);
            }

        } catch (IOException e) {
            System.out.println("有人离线了");
            selectionKey.cancel();
            try {
                channel.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    }

    private void sendMsgToClient(String msg, SocketChannel socketChannel) {
        System.out.println("准备给其他客户端发送消息,当前线程是：" + Thread.currentThread().getName());
        for (SelectionKey selectionKey : selector.keys()) {
            Channel channel = selectionKey.channel();
            if (channel instanceof SocketChannel && channel != socketChannel) {
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                byteBuffer.put(msg.getBytes());
                byteBuffer.flip();
                try {
                    System.out.println("*****开始发送****");
                    ((SocketChannel) channel).write(byteBuffer);
                    byteBuffer.clear();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        ChatServer server = new ChatServer();
        server.listen();
    }
}
