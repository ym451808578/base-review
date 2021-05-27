package org.example.pattern.interprate;

/**
 * @author Castle
 * @Date 2021/5/27 10:38
 */
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    //每个解析公式只需要关心自己左右的表达式的结果
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
