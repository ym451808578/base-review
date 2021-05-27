package org.example.pattern.interprate;

import java.util.HashMap;

/**
 * @author Castle
 * @Date 2021/5/27 10:48
 */
public class MinusSymbolExpression extends SymbolExpression {
    public MinusSymbolExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return left.interpreter(var) - right.interpreter(var);
    }
}
