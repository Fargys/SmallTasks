package com.denisov.patterns.behavioral.state;

public class Sleeping implements Activity {
    @Override
    public String justDoIt() {
        return "sleeping";
    }
}
