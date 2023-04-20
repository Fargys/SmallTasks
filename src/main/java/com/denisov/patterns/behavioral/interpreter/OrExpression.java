package com.denisov.patterns.behavioral.interpreter;

public class OrExpression implements Expression {
    private final Expression first;
    private final Expression second;

    public OrExpression(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean interpret(String context) {
        return first.interpret(context) || second.interpret(context);
    }
}
