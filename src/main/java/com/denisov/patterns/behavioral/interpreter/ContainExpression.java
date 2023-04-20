package com.denisov.patterns.behavioral.interpreter;

public class ContainExpression implements Expression {
    private final String data;

    public ContainExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
