package com.denisov.patterns.behavioral.command;

public class InsertCommand implements Command {
    private final Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public String execute() {
        return database.insert();
    }
}
