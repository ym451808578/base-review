package org.example.pattern.interprate;

import java.util.HashMap;

/**
 * @author Castle
 * @Date 2021/5/27 10:33
 */
public abstract class Expression {
    public abstract int interpreter(HashMap<String, Integer> var);
}
