package Homework1.view.command;

import Homework1.view.ConsoleUI;

public class Finish implements Command {
    private ConsoleUI consoleUI;

    public Finish(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }

    @Override
    public String getDescription() {
        return "Выход из программы";
    }

    @Override
    public void execute() {
        consoleUI.finish();
    }
}
