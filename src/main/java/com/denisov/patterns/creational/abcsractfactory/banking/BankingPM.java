package com.denisov.patterns.creational.abcsractfactory.banking;

import com.denisov.patterns.creational.abcsractfactory.Manager;

public class BankingPM implements Manager {
    @Override
    public String manage() {
        return "manage banking";
    }
}
