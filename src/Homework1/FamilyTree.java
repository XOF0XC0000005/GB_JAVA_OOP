package Homework1;

import java.util.ArrayList;

public class FamilyTree {
    ArrayList<Human> family;

    public ArrayList<Human> getFamily() {
        ArrayList<Human> familyArray = new ArrayList<>(family);
        return familyArray;
    }

    public void addFamilyMember(Human familyMember)
    {
        for (Human mem : family)
        {
            if (familyMember.getName().equals(mem.getName()))
            {
                System.out.println("Такой пользователь уже есть в списке");
                return;
            }
        }

        family.add(familyMember);
        System.out.println("Пользователь добавлен!");
    }
}
