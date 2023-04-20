package com.denisov.patterns.creational.abcsractfactory.banking;

import com.denisov.patterns.creational.abcsractfactory.Developer;
import com.denisov.patterns.creational.abcsractfactory.Manager;
import com.denisov.patterns.creational.abcsractfactory.TeamFactory;
import com.denisov.patterns.creational.abcsractfactory.Tester;

public class BankingTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Manager getManager() {
        return new BankingPM();
    }
}
