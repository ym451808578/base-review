package org.example.pattern.interprate;

import java.util.HashMap;

/**
 * @author Castle
 * @Date 2021/5/27 10:41
 */
public class AddSymbolExpression extends SymbolExpression {
    public AddSymbolExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
