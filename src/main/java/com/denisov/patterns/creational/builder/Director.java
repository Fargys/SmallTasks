package com.denisov.patterns.creational.builder;

public class Director {
    private WebSiteBuilder builder;

    public Website buildWebsite() {
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        return builder.getWebsite();
    }

    public void setBuilder(WebSiteBuilder builder) {
        this.builder = builder;
    }
}
