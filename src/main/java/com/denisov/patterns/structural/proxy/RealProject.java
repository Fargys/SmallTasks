package com.denisov.patterns.structural.proxy;

public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        url += " loaded";
    }

    @Override
    public String run() {
        return url;
    }

    public String getUrl() {
        return url;
    }
}
