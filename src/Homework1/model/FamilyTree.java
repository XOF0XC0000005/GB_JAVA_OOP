package Homework1.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

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

    public T getMaleMember(int index) {
        ArrayList<T> males = getMales();

        return males.get(index - 1);
    }

    public T getFemaleMember(int index) {
        ArrayList<T> females = getFemales();

        return females.get(index - 1);
    }

    public ArrayList getMales() {
        ArrayList males = new ArrayList<Human>();

        for (T hum : family) {
            if (hum.getSex().equals("male")) {
                males.add(hum);
            }
        }

        return males;
    }

    public ArrayList getFemales() {
        ArrayList females = new ArrayList();

        for (T hum : family) {
            if (hum.getSex().equals("female")) {
                females.add(hum);
            }
        }
        return females;
    }

    public List<T> getMembers(Predicate predicate)
    {
        return family.stream().filter(predicate::isEqual).collect(Collectors.toList());
    }

    @Override
    public Iterator<Human> iterator() {
        return new FamilyTreeIterator(family);
    }
}
