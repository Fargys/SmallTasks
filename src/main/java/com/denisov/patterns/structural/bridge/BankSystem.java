package com.denisov.patterns.structural.bridge;

public class BankSystem extends Program {
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public String developProgram() {
        return developer.writeCode() + " bank system";
    }
}
