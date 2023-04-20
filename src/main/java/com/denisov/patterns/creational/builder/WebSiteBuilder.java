package com.denisov.patterns.creational.builder;

public abstract class WebSiteBuilder {
    Website website;

    public void createWebsite() {
        website = new Website();
    }

    abstract void buildName();

    abstract void buildCms();

    abstract void buildPrice();

    public Website getWebsite() {
        return website;
    }
}
