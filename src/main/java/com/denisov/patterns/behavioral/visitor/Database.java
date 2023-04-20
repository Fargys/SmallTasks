package com.denisov.patterns.behavioral.visitor;

public class Database implements ProjectElement {
    @Override
    public String beWritten(Developer developer) {
        return developer.create(this);
    }
}
