package com.denisov.patterns.behavioral.command;

public class Database {

    public String select(){
        return "select";
    }

    public String insert(){
        return "insert";
    }

    public String update(){
        return "update";
    }

    public String delete(){
        return "delete";
    }
}
