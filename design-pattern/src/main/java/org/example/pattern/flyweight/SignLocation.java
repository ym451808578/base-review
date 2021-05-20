package org.example.pattern.flyweight;

import lombok.Data;

/**
 * @author Castle
 * @Date 2021/5/20 9:27
 */
public class SignLocation implements ISignInfo {

    private String location;

    public SignLocation(String location) {
        this.location = location;
        System.out.println("考场" + location + "被创建");
    }

    @Override
    public void signUp(SignUser signUser) {
        System.out.println(signUser.getUsername() + "报名地点：" + location);
    }
}
