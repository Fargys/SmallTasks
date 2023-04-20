package com.denisov.patterns.creational.abcsractfactory.website;

import com.denisov.patterns.creational.abcsractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public String writeCode() {
        return "PHP";
    }
}
