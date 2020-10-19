package com.tasks5.command;

public class Application {

    public static void main(String[] args) {
        Command command;
        if(args == null || args.length < 1 || args.length > 3) {
            command = new Error();
        } else if(args.length == 1) {
            command = switch (args[0]) {
                case "help" -> new Help();
                case "exit" -> new Exit();
                default -> new Error();
            };
        } else {
            command = switch (args[0]) {
                case "echo" -> new Echo(args[1]);
                case "date" -> args[1].equals("now") ? new Date() : new Error();
                default -> new Error();
            };
        }
        command.execute();
    }
}
