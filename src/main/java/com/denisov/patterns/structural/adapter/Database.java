package com.denisov.patterns.structural.adapter;

public interface Database {
    String select();
    String insert();
    String update();
    String remove();
}
