package com.denisov.patterns.creational.builder;

public class Website {
    private String name;
    private CMS cms;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(CMS cms) {
        this.cms = cms;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", cms=" + cms +
                ", price=" + price +
                '}';
    }
}
