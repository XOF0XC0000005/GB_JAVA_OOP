package Homework1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        Human firstHuman = new Human("Artem", 44, null, null, null);
        Human secondHuman = new Human("Margo", 44, null, null, null);
        Human thirdHuman = new Human("Anya", 22,null, null, null);
        Human fourthHuman = new Human("Dmitriy", 22,null, null, null);
        Human fivesHuman = new Human("Martin", 12,null, null, null);
        Human sixHuman = new Human("Karim", 10,null, null, null);

        ArrayList<Human> firstAndSecondMemberChilds = new ArrayList<>();
        firstAndSecondMemberChilds.add(thirdHuman);
        ArrayList<Human> thirdAndFourthMemberChilds = new ArrayList<>();
        thirdAndFourthMemberChilds.add(fivesHuman);
        thirdAndFourthMemberChilds.add(sixHuman);
        thirdHuman.setFather(firstHuman);
        thirdHuman.setMother(secondHuman);
        fivesHuman.setFather(fourthHuman);
        fivesHuman.setMother(thirdHuman);
        sixHuman.setFather(fourthHuman);
        sixHuman.setMother(thirdHuman);
        firstHuman.setChildrens(firstAndSecondMemberChilds);
        secondHuman.setChildrens(firstAndSecondMemberChilds);
        fourthHuman.setChildrens(thirdAndFourthMemberChilds);
        thirdHuman.setChildrens(thirdAndFourthMemberChilds);

        firstHuman.showChildrens();
        fourthHuman.showChildrens();
    }
}