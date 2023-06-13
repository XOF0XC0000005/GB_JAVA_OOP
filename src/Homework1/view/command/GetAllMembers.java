package Homework1.view.command;

import Homework1.view.ConsoleUI;

public class GetAllMembers implements Command {

    private ConsoleUI consoleUI;

    public GetAllMembers(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }

    @Override
    public String getDescription() {
        return "Показать все дерево";
    }

    @Override
    public void execute() {
        consoleUI.getAllMembers();
    }
}
