package com.denisov.patterns.creational.abcsractfactory.website;

import com.denisov.patterns.creational.abcsractfactory.Manager;

public class WebsitePM implements Manager {
    @Override
    public String manage() {
        return "manage website";
    }
}
