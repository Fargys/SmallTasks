package com.denisov.patterns.creational.abcsractfactory;

public interface TeamFactory {
    Developer getDeveloper();
    Tester getTester();
    Manager getManager();
}
