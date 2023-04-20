package com.denisov.patterns.structural.bridge;

public class StockExchange extends Program {
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public String developProgram() {
        return developer.writeCode() + " stock exchange";
    }
}
