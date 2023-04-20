package com.denisov.patterns.behavioral.command;

public class UpdateCommand implements Command {
    private final Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public String execute() {
        return database.update();
    }
}
