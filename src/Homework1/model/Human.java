package Homework1.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Human implements Serializable, Comparable<Human>, FamilyTreeItem {
    private String name;
    private String sex;
    private int age;
    private Human father;
    private Human mother;
    private ArrayList<Human> childrens;

    public Human(String name, String sex, int age, Human father, Human mother) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.father = father;
        this.mother = mother;
        this.childrens = new ArrayList<>();
    }

    public void showChildrens() {
        System.out.println("Childrens: ");

        for (Human children : childrens) {
            System.out.println(children);
        }

        System.out.println();
    }

    @Override
    public void addChild(FamilyTreeItem child) {
        this.childrens.add((Human) child);
    }

    public Human getFather() {
        return this.father;
    }

    public Human getMother() {
        return this.mother;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public ArrayList<Human> getChildrens() {
        return childrens;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\nВозраст: " + age + "\nОтец: \n" + father + "\nМама: \n" + mother;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Human)) {
            return false;
        }

        Human human = (Human) obj;
        return human.getName().equals((getName()));
    }

    @Override
    public int compareTo(Human o) {
        return Integer.compare(this.age, o.age);
    }
}
