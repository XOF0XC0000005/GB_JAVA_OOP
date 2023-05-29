package Homework1;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Human {
    private String name;
    private int age;
    private Human father;
    private Human mother;
    private ArrayList<Human> childrens;

    public Human(String name, int age, Human father, Human mother)
    {
        this.name = name;
        this.age = age;
        this.father = father;
        this.mother = mother;
        this.childrens = new ArrayList<>();
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

    public void addChild(Human child)
    {
        this.childrens.add(child);
    }

    public Human getFather()
    {
        return this.father;
    }

    public Human getMother()
    {
        return this.mother;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\nВозраст: " + age;
    }
}
