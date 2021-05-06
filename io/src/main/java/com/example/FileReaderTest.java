package com.example;

import org.junit.Test;

import java.io.*;

/**
 * @author castle
 */
public class FileReaderTest {

    @Test
    public void fileReadTest() {
        File file = new File("hello.txt");
        FileReader fileReader = null;
        int idx;
        try {
            fileReader = new FileReader(file);
            while ((idx = fileReader.read()) != -1) {
                System.out.print((char) idx);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void fileReadTest2() {
        File file = new File("hello.txt");
        FileReader fileReader = null;
        char[] chars=new char[5];
        int idx;
        try {
            fileReader = new FileReader(file);
            while ((idx = fileReader.read(chars)) != -1) {
//                String s=new String(chars,0,idx);
//                System.out.print(s);
                for (int i=0;i<idx;i++){
                    System.out.print(chars[i]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testCopy(){
        File srcFile=new File("hello.txt");
        File destFile=new File("hello1.txt");
        FileReader fileReader=null;
        FileWriter fileWriter=null;
        try {
            char[] chars=new char[5];
            int len;
            fileReader=new FileReader(srcFile);
            fileWriter=new FileWriter(destFile);
            while ((len=fileReader.read(chars))!=-1){
                fileWriter.write(chars,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
