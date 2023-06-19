package Homework1.view;

import java.util.ArrayList;
import java.util.List;

import Homework1.view.command.AddMember;
import Homework1.view.command.Command;
import Homework1.view.command.Finish;
import Homework1.view.command.GetAllMembers;


public class MainMenu {
    private final List<Command> commands;

    public MainMenu(ConsoleUI ui) {
        commands = new ArrayList<>();
        commands.add(new AddMember(ui));
        commands.add(new GetAllMembers(ui));
        commands.add(new Finish(ui));
    }

    public String getMenu() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            builder.append(i + 1);
            builder.append(". ");
            builder.append(commands.get(i).getDescription());
            builder.append("\n");
        }
        return builder.toString();
    }

    public void execute(int choice) {
        commands.get(choice - 1).execute();
    }

    public int getSize(){
        return commands.size();
    }
}
