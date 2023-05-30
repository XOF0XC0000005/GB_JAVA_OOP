package Homework1;

import java.io.Serializable;
import java.util.ArrayList;

public class Human implements Serializable {
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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\nВозраст: " + age + "\nОтец: \n" + father + "\nМама: \n" + mother;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (!(obj instanceof Human))
        {
            return false;
        }

        Human human = (Human) obj;
        return human.getName().equals((getName()));
    }
}
