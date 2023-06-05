package Homework1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        Human firstHuman = new Human("Artem", 60, null, null);
        Human secondHuman = new Human("Margo", 62, null, null);
        Human thirdHuman = new Human("Anya", 40, firstHuman, secondHuman);
        Human fourthHuman = new Human("Dmitriy", 41,null, null);
        Human fivesHuman = new Human("Martin", 12, fourthHuman, thirdHuman);
        Human sixHuman = new Human("Karim", 10, fourthHuman, thirdHuman);

        familyTree.addFamilyMember(firstHuman);
        familyTree.addFamilyMember(secondHuman);
        familyTree.addFamilyMember(thirdHuman);
        familyTree.addFamilyMember(fourthHuman);
        familyTree.addFamilyMember(fivesHuman);
        familyTree.addFamilyMember(sixHuman);
        familyTree.addFamilyMember(thirdHuman);

        FileHandler fileHandler = new FileHandler();
        fileHandler.save("C:\\Users\\l.reva\\IdeaProjects\\Object_Oriented_Programming\\src\\Homework1\\savedTree.txt", familyTree);
        Serializable loadedObject = fileHandler.load("C:\\Users\\l.reva\\IdeaProjects\\Object_Oriented_Programming\\src\\Homework1\\savedTree.txt", "FamilyTree");
        FamilyTree loadedFamilyTree = (FamilyTree) loadedObject;

        Iterator<Human> iterator = loadedFamilyTree.iterator();

        if (loadedFamilyTree != null)
        {
            ArrayList<Human> loadedFamily = loadedFamilyTree.getFamily();
            for (Human hum : loadedFamily)
            {
                System.out.println(hum);
                System.out.println();
            }

            Collections.sort(loadedFamily);
            System.out.println();
            System.out.println();
            System.out.println();

            for (Human hum :
                    loadedFamily) {
                System.out.println(hum);
                System.out.println();
            }

            System.out.println();
            System.out.println();
            System.out.println();

            loadedFamily.sort(new ChildrensComparator());
            for (Human hum :
                    loadedFamily) {
                System.out.println(hum);
                System.out.println();
            }

        }
    }
}