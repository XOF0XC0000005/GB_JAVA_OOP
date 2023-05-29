package Homework1;

import java.util.ArrayList;

public class FamilyTree {
    private ArrayList<Human> family;

    public FamilyTree()
    {
        this.family = new ArrayList<>();
    }

    public void addFamilyMember(Human familyMember)
    {
        if (family.contains(familyMember))
        {
            System.out.println("Такой пользователь уже есть в списке");
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
            System.out.println("Родственник добавлен!");
        }
    }
}
