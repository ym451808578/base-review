package org.example.pattern.flyweight;

/**
 * @author Castle
 * @Date 2021/5/20 9:26
 */
public interface ISignInfo {

    /**
     * 非享元作为外部状态，以参数的形式传入。
     *
     * @param signUser
     */
    void signUp(SignUser signUser);
}
