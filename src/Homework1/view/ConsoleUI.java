package Homework1.view;

import Homework1.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View {

    private final Presenter presenter;
    private final Scanner scanner;
    private boolean isWork;
    private final MainMenu mainMenu;

    public ConsoleUI() {
        isWork = true;
        presenter = new Presenter();
        scanner = new Scanner(System.in);
        mainMenu = new MainMenu(this);
    }

    @Override
    public void print(String text) {
        System.out.print(text);
    }

    @Override
    public void start() {
        do {
            print(mainMenu.getMenu());
            Integer input = getIntegerInput(1, mainMenu.getSize());
            mainMenu.execute(input);
        } while (isWork);
    }

    public void getAllMembers() {
        print(presenter.getMembersNames());
    }

    public void finish() {
        isWork = false;
    }

    public void addNewMember() {
        presenter.addNewMember(getName(), getSex(), getAge(), getFatherIndex(), getMotherIndex());
    }

    public void save() {
        presenter.save();
    }

    private Integer getIntegerInput(int min, int max) {
        do {
            print("> ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                return null;
            }
            if (input.matches("[0-9]+")) {
                int parsed = Integer.parseInt(input);
                if (parsed >= min && parsed <= max)
                    return parsed;
            }
        } while (true);
    }

    private String getStringInput() {
        String input;
        do {
            print("> ");
            input = scanner.nextLine();
            if (!input.equals(""))
                return input;
        } while (true);
    }

    private int getMotherIndex() {
        print("Выберите мать (Введите 0, если нет матери): \n");
        print(presenter.getFemalesNames());
        int mother = getIntegerInput(0, presenter.getFemaleAmount()) - 1;
        if (mother == -1) {
            print("Ошибка ввода\n");
        } else {
            print("Вы ввели: " + presenter.getFemaleName(mother) + "\n");
        }
        return mother;
    }

    private int getFatherIndex() {
        print("Выберите отца (Введите 0, если нет отца): \n");
        print(presenter.getMalesNames());
        int father = getIntegerInput(0, presenter.getMaleAmount()) - 1;
        if (father == -1) {
            print("Ошибка ввода\n");
        } else {
            print("Вы ввели: " + presenter.getMaleName(father) + "\n");
        }
        return father;
    }

    private String getSex() {
        print("Введите пол 'male' или 'female':\n");
        String sex = scanner.nextLine();
        print("Вы ввели: " + sex + "\n");
        return sex;
    }

    private int getAge() {
        print("Введите возраст:\n");
        int age = Integer.parseInt(scanner.nextLine());
        print("Вы ввели: " + age + "\n");
        return age;
    }

    private String getName() {
        print("Введите имя:\n");
        String fullName = getStringInput();
        print("Вы ввели: " + fullName + "\n");
        return fullName;
    }
}