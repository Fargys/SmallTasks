package com.denisov.patterns.creational.builder;

public class VisitCardWebsiteBuilder extends WebSiteBuilder {

    @Override
    void buildName() {
        website.setName("visit card");
    }

    @Override
    void buildCms() {
        website.setCms(CMS.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
