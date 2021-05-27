package org.example.pattern.interprate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author Castle
 * @Date 2021/5/27 11:06
 */
public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String, Integer> map = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("计算机构：" + expStr + "=" + calculator.run(map));
    }

    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式");
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
    //Context角色
    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap hashMap = new HashMap();
        for (char c : expStr.toCharArray()) {
            if (c != '+' && c != '-') {
                if (!hashMap.containsKey(String.valueOf(c))) {
                    System.out.println("请输入" + String.valueOf(c) + "的值：");
                    String in = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    hashMap.put(String.valueOf(c), Integer.valueOf(in));
                }
            }
        }
        return hashMap;
    }
}
