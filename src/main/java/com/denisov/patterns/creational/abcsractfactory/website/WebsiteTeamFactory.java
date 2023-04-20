package com.denisov.patterns.creational.abcsractfactory.website;

import com.denisov.patterns.creational.abcsractfactory.Developer;
import com.denisov.patterns.creational.abcsractfactory.Manager;
import com.denisov.patterns.creational.abcsractfactory.TeamFactory;
import com.denisov.patterns.creational.abcsractfactory.Tester;

public class WebsiteTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getManager() {
        return new WebsitePM();
    }
}
