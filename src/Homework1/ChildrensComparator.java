package Homework1;

import java.util.Comparator;

public class ChildrensComparator implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o1.getChildrens().size(), o2.getChildrens().size());
    }
}
