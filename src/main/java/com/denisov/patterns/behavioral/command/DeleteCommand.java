package com.denisov.patterns.behavioral.command;

public class DeleteCommand implements Command {
    private final Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public String execute() {
        return database.delete();
    }
}
