package org.example;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @author castle
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("127.0.0.1",9999);
            OutputStream outputStream = socket.getOutputStream();
            PrintStream printStream=new PrintStream(outputStream);
            printStream.println("this is a msg from client");
            printStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
