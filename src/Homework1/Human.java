package Homework1;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Human {
    private String name;
    private int age;
    private Human father;
    private Human mother;
    private ArrayList<Human> childrens;

    public Human(String name, int age, Human father, Human mother, ArrayList<Human> childrens)
    {
        this.name = name;
        this.age = age;
        this.father = father;
        this.mother = mother;
        this.childrens = childrens;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Human> getChildrens() {
        ArrayList<Human> parentChildrens = new ArrayList<>(childrens);
        return parentChildrens;
    }

    public void showChildrens() {
        System.out.println("Parent: \n" + "Имя: " + name + "\nВозраст: " + age + "\n");
        System.out.println("Childrens: ");

        for (Human children : childrens)
        {
            System.out.println(children);
        }

        System.out.println();
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setChildrens(ArrayList<Human> childrens) {
        this.childrens = childrens;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\nВозраст: " + age;
    }
}
