package com.denisov.patterns.creational.builder;

public class EnterpriseWebsiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise");
    }

    @Override
    void buildCms() {
        website.setCms(CMS.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10_000);
    }
}
