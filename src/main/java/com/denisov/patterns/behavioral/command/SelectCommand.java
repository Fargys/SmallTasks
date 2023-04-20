package com.denisov.patterns.behavioral.command;

public class SelectCommand implements Command {
    private final Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public String execute() {
        return database.select();
    }
}
