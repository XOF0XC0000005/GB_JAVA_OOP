package Homework1.comparators;

import Homework1.interfaces.FamilyTreeItem;

import java.util.Comparator;

public class AgeComparator<T extends FamilyTreeItem> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
