package com.denisov.patterns.creational.abcsractfactory.website;

import com.denisov.patterns.creational.abcsractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public String testCode() {
        return "test manual";
    }
}
