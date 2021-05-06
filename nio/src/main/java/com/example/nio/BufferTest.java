package com.example.nio;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * @author castle
 */
public class BufferTest {

    @Test
    public void BufferTest() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());
        System.out.println("******************");
        String name = "castle";
        byteBuffer.put(name.getBytes());
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());
        System.out.println("******************");
        byteBuffer.flip();
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());
        System.out.println("******************");
        byte b = byteBuffer.get();
        System.out.println((char) b);
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());
        System.out.println("******************");
        byteBuffer.mark();
        byte[] bytes=new byte[2];
        System.out.println(byteBuffer.get(bytes).toString());
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());
        System.out.println("******************");
        System.out.println(byteBuffer.remaining());
        byteBuffer.reset();
        System.out.println(byteBuffer.remaining());


    }
}
