package com.denisov.patterns.creational.prototype;

import java.util.Objects;

public class Project implements Cloneable {
    private int id;
    private String projectName;
    private String source;

    public Project(int id, String projectName, String source) {
        this.id = id;
        this.projectName = projectName;
        this.source = source;
    }

    @Override
    public Object copy() {
        return new Project(id, projectName, source);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", source='" + source + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return id == project.id &&
                Objects.equals(projectName, project.projectName) &&
                Objects.equals(source, project.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectName, source);
    }
}
