package com.example.nio;

import org.junit.Test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author castle
 */
public class ChannelTest {

    @Test
    public void testWrite(){
        File file=new File("data.txt");
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            FileChannel channel = fileOutputStream.getChannel();
            ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
            byteBuffer.put("Hello World".getBytes());
            byteBuffer.flip();
            channel.write(byteBuffer);
            channel.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRead(){
        File file=new File("data.txt");
        try {
            FileInputStream fileInputStream=new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            ByteBuffer byteBuffer=ByteBuffer.allocate(2048);
            int read;
            while ((read=channel.read(byteBuffer))!=-1){
                byteBuffer.flip();
                System.out.print(new String(byteBuffer.array(),0,read));
            }
            channel.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void copyTest(){
        File srcFile=new File("11.jpeg");
        File destFile=new File("22.jpeg");
        try {
            FileInputStream inputStream=new FileInputStream(srcFile);
            FileOutputStream outputStream=new FileOutputStream(destFile);
            FileChannel inputStreamChannel = inputStream.getChannel();
            FileChannel outputStreamChannel = outputStream.getChannel();
            ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
            int len;
            while ((len=inputStreamChannel.read(byteBuffer))!=-1){
                byteBuffer.flip();
                outputStreamChannel.write(byteBuffer);
                byteBuffer.clear();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
