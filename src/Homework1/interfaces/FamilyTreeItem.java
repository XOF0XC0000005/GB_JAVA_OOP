package Homework1.interfaces;

import Homework1.Human;

import java.util.ArrayList;

public interface FamilyTreeItem {
    void addChild(FamilyTreeItem child);

    FamilyTreeItem getFather();

    FamilyTreeItem getMother();

    String getName();

    int getAge();

    ArrayList<Human> getChildrens();
}
