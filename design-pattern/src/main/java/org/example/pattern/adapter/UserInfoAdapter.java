package org.example.pattern.adapter;

import java.util.Map;

/**
 * @author Castle
 * @Date 2021/5/18 15:22
 */
//public class UserInfoAdapter extends OldUserInfo implements IUserInfo {
//
//    @Override
//    public String getUsername() {
//        return this.getBaseInfo().get("username");
//    }
//
//    @Override
//    public String getPosition() {
//        return this.getOfficeInfo().get("pos");
//    }
//}
public class UserInfoAdapter implements IUserInfo {

    private OldUserInfo userInfo;

    public UserInfoAdapter(OldUserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String getUsername() {
        return userInfo.getBaseInfo().get("username");
    }

    @Override
    public String getPosition() {
        return userInfo.getOfficeInfo().get("pos");
    }
}
