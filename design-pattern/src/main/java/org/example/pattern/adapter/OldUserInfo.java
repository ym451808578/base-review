package org.example.pattern.adapter;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Castle
 * @Date 2021/5/18 15:19
 */
@Data
public class OldUserInfo {
    private Map<String, String> baseInfo = new HashMap<String, String>() {{
        put("username", "castle");
    }};
    private Map<String, String> officeInfo = new HashMap<String, String>() {{
        put("pos", "manager");
    }};

    public Map<String, String> getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(Map<String, String> baseInfo) {
        this.baseInfo = baseInfo;
    }

    public Map<String, String> getOfficeInfo() {
        return officeInfo;
    }

    public void setOfficeInfo(Map<String, String> officeInfo) {
        this.officeInfo = officeInfo;
    }
}
