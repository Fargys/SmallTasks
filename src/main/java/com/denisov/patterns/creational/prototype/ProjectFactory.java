package com.denisov.patterns.creational.prototype;

public class ProjectFactory {
    private Project project;

    public Project cloneProject() {
        return (Project) project.copy();
    }

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
