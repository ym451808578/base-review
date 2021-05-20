package org.example.pattern.flyweight;

import java.util.Map;

/**
 * @author Castle
 * @Date 2021/5/20 9:52
 */
public class Client {
    public static void main(String[] args) {
        SignFactory signFactory = new SignFactory();
        ISignInfo signInfo1 = signFactory.getSignInfo("广州01考场");
        ISignInfo signInfo2 = signFactory.getSignInfo("广州02考场");
        ISignInfo signInfo3 = signFactory.getSignInfo("广州01考场");
        ISignInfo signInfo4 = signFactory.getSignInfo("广州02考场");
        signInfo1.signUp(new SignUser("张三"));
        signInfo2.signUp(new SignUser("李四"));
        signInfo3.signUp(new SignUser("王五"));
        signInfo4.signUp(new SignUser("赵柳"));
    }
}
