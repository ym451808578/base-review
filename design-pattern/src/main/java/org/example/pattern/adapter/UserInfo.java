package org.example.pattern.adapter;

import lombok.Data;

/**
 * @author Castle
 * @Date 2021/5/18 15:32
 */
@Data
public class UserInfo {
    private String username;
    private String pos;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }
}
