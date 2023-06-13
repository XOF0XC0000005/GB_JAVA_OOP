package Homework1.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class FamilyTree<T extends FamilyTreeItem> implements Serializable, Iterable<Human>, Service {

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

    public ArrayList<T> getMales() {
        ArrayList<T> males = new ArrayList<T>();

        for (T hum : this.family) {
            if (hum.getSex().equals("male")) {
                males.add(hum);
            }
        }

        return males;
    }

    public ArrayList<T> getFemales() {
        ArrayList<T> female = new ArrayList<T>();

        for (T hum : this.family) {
            if (hum.getSex().equals("female")) {
                female.add(hum);
            }
        }

        return female;
    }

    @Override
    public Iterator<Human> iterator() {
        return new FamilyTreeIterator(family);
    }
}
