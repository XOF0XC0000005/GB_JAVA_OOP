package Homework1;

import Homework1.comparators.AgeComparator;
import Homework1.comparators.ChildrensComparator;
import Homework1.interfaces.FamilyTreeItem;
import Homework1.iterators.FamilyTreeIterator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class FamilyTree<T extends FamilyTreeItem> implements Serializable, Iterable<Human> {

    private static final long serialVersionUID = 1L;
    private ArrayList<T> family;

    public FamilyTree() {
        this.family = new ArrayList<>();
    }

    public boolean addFamilyMember(T familyMember) {
        if (family.contains(familyMember)) {
            return false;
        } else {
            if (familyMember.getFather() != null) {
                T father = (T) familyMember.getFather();
                father.addChild(familyMember);
            }

            if (familyMember.getMother() != null) {
                T mother = (T) familyMember.getMother();
                mother.addChild(familyMember);
            }

            family.add(familyMember);
            return true;
        }
    }

    public ArrayList<T> getFamily() {
        return family;
    }

    public void sortByChildrensAmount(ArrayList<T> collection) {
        collection.sort(new ChildrensComparator<>());
    }

    public void sortByAge(ArrayList<T> collection) {
        collection.sort(new AgeComparator<>());
    }

    @Override
    public Iterator<Human> iterator() {
        return new FamilyTreeIterator(family);
    }
}
