package Homework1.view;

import Homework1.model.FamilyTree;
import Homework1.model.Human;
import Homework1.presenter.Presenter;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleUI implements View {

    private Presenter presenter;
    private Scanner scanner;
    private MainMenu mainMenu;
    private boolean work;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        mainMenu = new MainMenu(this);
        work = true;
        presenter = new Presenter(this, new FamilyTree<Human>());
    }

    @Override
    public void print(String text) {

    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        System.out.println("Добро пожаловать на фамильное древо!");
        while (work) {
            System.out.println(mainMenu.printMenu());
            int choice = userInput();

            if (choice == -1) {
                System.out.println("Ошибка ввода");
                continue;
            }

            mainMenu.execute(choice);
        }
    }

    private int userInput() {
        String line = scanner.nextLine();

        if (!checkLine(line)) {
            System.out.println("Ошибка ввода");
            return -1;
        }

        return Integer.parseInt(line);
    }

    private boolean checkLine(String line) {
        if (!line.matches("[0-9]+")) {
            return false;
        }

        int choice = Integer.parseInt(line);

        return choice > 0 && choice <= mainMenu.size();

    }

    public void addMember() {
        System.out.println("Введите имя члена семьи");
        String name = scanner.nextLine();
        System.out.println("Введите пол члена семьи");
        String sex = scanner.nextLine();
        System.out.println("Введите возраст члена семьи");
        String strAge = scanner.nextLine();
        int age;

        if (!strAge.matches("[0-9]+")) {
            age = 0;
        } else {
            age = Integer.parseInt(strAge);
        }

        System.out.println("Введите подходящий номер записи отца");
        ArrayList<Human> males = presenter.getService().getMales();

        System.out.println("0 - Нет отца");

        for (int i = 0; i < males.size(); i++) {
            System.out.println(i + 1 + " - " + males.get(i).getName());
        }

        String fatherUserInput = scanner.nextLine();
        Human father = null;

        if (fatherUserInput.equals("0")) {
            father = null;
        } else {
            father = males.get(Integer.parseInt(fatherUserInput) - 1);
        }

        System.out.println();

        System.out.println("Выберите подходящий номер записи матери");
        ArrayList<Human> females = presenter.getService().getFemales();

        System.out.println("0 - Нет матери");

        for (int i = 0; i < females.size(); i++) {
            System.out.println(i + 1 + " - " + females.get(i).getName());
        }

        String motherUserInput = scanner.nextLine();
        Human mother = null;

        if (motherUserInput.equals("0")) {
            mother = null;
        } else {
            mother = females.get(Integer.parseInt(motherUserInput) - 1);
        }

        System.out.println("Член семьи добавлен");

        presenter.getService().addFamilyMember(new Human(name, sex, age, father, mother));
    }

    public void finish() {
        System.out.println("Приятно было поработать");
        work = false;
    }

    public void getAllMembers() {
        ArrayList<Human> family = presenter.getService().getFamily();

        for (Human hum :
                family) {
            System.out.println(hum);
            System.out.println();
        }
    }
}
