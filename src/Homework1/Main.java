package Homework1;

import Homework1.model.FamilyTree;
import Homework1.model.FileHandler;
import Homework1.model.Human;
import Homework1.view.ConsoleUI;
import Homework1.view.View;

import java.io.Serializable;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        FamilyTree<Human> familyTree = new FamilyTree<>();
//        Human firstHuman = new Human("Artem", "male", 60, null, null);
//        Human secondHuman = new Human("Margo", "female",62, null, null);
//        Human thirdHuman = new Human("Anya", "female",40, firstHuman, secondHuman);
//        Human fourthHuman = new Human("Dmitriy", "male", 41, null, null);
//        Human fivesHuman = new Human("Martin", "male",12, fourthHuman, thirdHuman);
//        Human sixHuman = new Human("Karim", "male",10, fourthHuman, thirdHuman);
//
//        familyTree.addFamilyMember(firstHuman);
//        familyTree.addFamilyMember(secondHuman);
//        familyTree.addFamilyMember(thirdHuman);
//        familyTree.addFamilyMember(fourthHuman);
//        familyTree.addFamilyMember(fivesHuman);
//        familyTree.addFamilyMember(sixHuman);
//        familyTree.addFamilyMember(thirdHuman);


        View view = new ConsoleUI();
        view.start();
//        FileHandler fileHandler = new FileHandler();
//        fileHandler.save("C:\\Users\\l.reva\\IdeaProjects\\Object_Oriented_Programming\\src\\Homework1\\savedTree.txt", familyTree);
//        Serializable loadedObject = fileHandler.load("C:\\Users\\l.reva\\IdeaProjects\\Object_Oriented_Programming\\src\\Homework1\\savedTree.txt", "FamilyTree");
//        FamilyTree loadedFamilyTree = (FamilyTree) loadedObject;

//        if (loadedFamilyTree != null) {
//            ArrayList<Human> loadedFamily = loadedFamilyTree.getFamily();
//
//            for (Human hum : loadedFamily) {
//                System.out.println(hum);
//                System.out.println();
//            }
//
//            familyTree.sortByAge(loadedFamily);
//            System.out.println();
//            System.out.println();
//            System.out.println();
//
//            for (Human hum : loadedFamily) {
//                System.out.println(hum);
//                System.out.println();
//            }
//
//            System.out.println();
//            System.out.println();
//            System.out.println();
//
//            familyTree.sortByChildrensAmount(loadedFamily);
//            for (Human hum : loadedFamily) {
//                System.out.println(hum);
//                System.out.println();
//            }
//        }
    }
}