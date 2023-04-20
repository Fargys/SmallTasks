package com.denisov.patterns.structural.proxy;

public class ProxyProject implements Project {
    private String url;
    private RealProject project;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public String run() {
        if(project == null)
            project = new RealProject(url);
        return project.run();
    }

    public String getUrl() {
        return url;
    }
}
