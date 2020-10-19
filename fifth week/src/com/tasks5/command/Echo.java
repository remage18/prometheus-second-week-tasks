package com.tasks5.command;

public class Echo implements Command{
    String text;

    Echo(String text) {
        this.text = text;
    }
    public void execute() {
        System.out.println(text);
    }
}
