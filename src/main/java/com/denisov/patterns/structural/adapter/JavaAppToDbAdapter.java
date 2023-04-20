package com.denisov.patterns.structural.adapter;

public class JavaAppToDbAdapter extends JavaApp implements Database {

    @Override
    public String select() {
        return loadObject();
    }

    @Override
    public String insert() {
        return saveObject();
    }

    @Override
    public String update() {
        return updateObject();
    }

    @Override
    public String remove() {
        return deleteObject();
    }
}
