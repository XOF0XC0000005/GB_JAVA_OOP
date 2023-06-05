package Homework1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class FamilyTree implements Serializable, Iterable<Human> {

    private static final long serialVersionUID = 1L;
    private ArrayList<Human> family;

    public FamilyTree()
    {
        this.family = new ArrayList<>();
    }

    public boolean addFamilyMember(Human familyMember)
    {
        if (family.contains(familyMember))
        {
            return false;
        }
        else
        {
            if (familyMember.getFather() != null)
            {
                Human father = familyMember.getFather();
                father.addChild(familyMember);
            }

            if (familyMember.getMother() != null)
            {
                Human mother = familyMember.getMother();
                mother.addChild(familyMember);
            }

            family.add(familyMember);
            return true;
        }
    }

    public ArrayList<Human> getFamily() {
        return family;
    }

    @Override
    public Iterator<Human> iterator() {
        Iterator<Human> iter = new Iterator<>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < family.size();
            }

            @Override
            public Human next() {
                return family.get(index++);
            }
        };
        return iter;
    }


}
