package com.denisov.patterns.behavioral.command;

public class Developer {
    Command select;
    Command insert;
    Command update;
    Command delete;

    public Developer(Command select, Command insert, Command update, Command delete) {
        this.select = select;
        this.insert = insert;
        this.update = update;
        this.delete = delete;
    }

    public String select() {
        return select.execute();
    }

    public String insert() {
        return insert.execute();
    }

    public String update() {
        return update.execute();
    }

    public String delete() {
        return delete.execute();
    }
}
