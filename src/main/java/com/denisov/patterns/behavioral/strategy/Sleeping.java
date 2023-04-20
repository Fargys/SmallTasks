package com.denisov.patterns.behavioral.strategy;

public class Sleeping implements Activity {
    @Override
    public String justDoIt() {
        return "sleeping";
    }
}
