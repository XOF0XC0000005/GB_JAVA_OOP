package Homework1.view.command;

import Homework1.view.ConsoleUI;

public class AddMember implements Command {

    private ConsoleUI consoleUI;

    public AddMember(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }

    @Override
    public String getDescription() {
        return "Добавить человека";
    }

    @Override
    public void execute() {
        consoleUI.addNewMember();
    }
}
