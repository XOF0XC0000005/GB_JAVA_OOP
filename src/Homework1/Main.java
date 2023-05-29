package Homework1;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        Human firstHuman = new Human("Artem", 60, null, null);
        Human secondHuman = new Human("Margo", 62, null, null);
        Human thirdHuman = new Human("Anya", 40,firstHuman, secondHuman);
        Human fourthHuman = new Human("Dmitriy", 41,null, null);
        Human fivesHuman = new Human("Martin", 12,fourthHuman, thirdHuman);
        Human sixHuman = new Human("Karim", 10,fourthHuman, thirdHuman);

        familyTree.addFamilyMember(firstHuman);
        familyTree.addFamilyMember(secondHuman);
        familyTree.addFamilyMember(thirdHuman);
        familyTree.addFamilyMember(fourthHuman);
        familyTree.addFamilyMember(fivesHuman);
        familyTree.addFamilyMember(sixHuman);
        familyTree.addFamilyMember(thirdHuman);

        firstHuman.showChildrens();
        secondHuman.showChildrens();
        thirdHuman.showChildrens();
        fourthHuman.showChildrens();
        fivesHuman.showChildrens();
        sixHuman.showChildrens();
    }
}