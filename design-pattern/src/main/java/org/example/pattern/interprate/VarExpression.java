package org.example.pattern.interprate;

import java.util.HashMap;

/**
 * @author Castle
 * @Date 2021/5/27 10:35
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
