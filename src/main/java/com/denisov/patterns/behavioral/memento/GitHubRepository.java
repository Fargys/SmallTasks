package com.denisov.patterns.behavioral.memento;

public class GitHubRepository {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
