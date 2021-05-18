package org.example.pattern.adapter;


/**
 * @author Castle
 * @Date 2021/5/18 15:33
 */
public class Client {
    public static void main(String[] args) {
        UserInfo info = new UserInfo();
        IUserInfo adapter = new UserInfoAdapter(new OldUserInfo());
        info.setUsername(adapter.getUsername());
        info.setPos(adapter.getPosition());
        System.out.println(info);
    }
}
