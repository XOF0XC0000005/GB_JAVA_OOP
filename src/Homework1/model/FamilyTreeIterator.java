package Homework1.model;

import java.util.ArrayList;
import java.util.Iterator;

public class FamilyTreeIterator<T extends FamilyTreeItem> implements Iterator<T> {

    private ArrayList<T> family;
    private int index = 0;

    public FamilyTreeIterator(ArrayList<T> familyList) {
        family = familyList;
    }

    public boolean hasNext() {
        return index < family.size();
    }

    public T next() {
        return family.get(index++);
    }
}
