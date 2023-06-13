package Homework1.model;

import java.util.Comparator;

public class ChildrensComparator<T extends FamilyTreeItem> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getChildrens().size(), o2.getChildrens().size());
    }
}
