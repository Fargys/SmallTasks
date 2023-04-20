package com.denisov.patterns.creational.abcsractfactory.banking;

import com.denisov.patterns.creational.abcsractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public String writeCode() {
        return "Java";
    }
}
