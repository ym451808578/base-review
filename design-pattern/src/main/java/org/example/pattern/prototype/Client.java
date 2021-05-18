package org.example.pattern.prototype;

import java.util.Random;

/**
 * @author Castle
 * @Date 2021/5/18 8:57
 */
public class Client {

    private static final int STR_LEN = 6;

    public static void main(String[] args) {
        Mail mail = new Mail(new SalaryTemplate());
        mail.setTail("感谢您对我们工作的支持");
        int i = 0;
        while (i < 6) {
            Mail cloneMail = mail.clone();
            cloneMail.setUsername(getRandomString(STR_LEN));
            sendMail(cloneMail);
            i++;
        }
    }

    private static void sendMail(Mail cloneMail) {
        System.out.println("通知主题：" + cloneMail.getSubject() + " 通知内容： " + "尊敬的" + cloneMail.getUsername() + ", " + cloneMail.getContext() + cloneMail.getTail());
    }

    private static String getRandomString(int length) {
        String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}

