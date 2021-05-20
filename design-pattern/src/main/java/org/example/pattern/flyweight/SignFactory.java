package org.example.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Castle
 * @Date 2021/5/20 9:48
 */
public class SignFactory {

    private Map<String, ISignInfo> signInfoMap = new HashMap<>();

    public ISignInfo getSignInfo(String location) {
        ISignInfo signInfo = signInfoMap.get(location);
        if (signInfo != null) {
            System.out.println(location + "考点已经存在");
        } else {
            signInfo = new SignLocation(location);
            signInfoMap.put(location, signInfo);
        }
        return signInfo;

    }
}
