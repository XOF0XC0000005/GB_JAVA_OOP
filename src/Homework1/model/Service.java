package Homework1.model;

import Homework1.model.repo.FileManipulation;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private FamilyTree<Human> familyTree;
    private final FileManipulation fileManipulator;

    public Service(FileManipulation fileManipulator) {
        this.fileManipulator = fileManipulator;
        familyTree = createHumanFamily();
    }

    public FamilyTree<Human> createHumanFamily() {
        FamilyTree<Human> family = new FamilyTree<>();
        Human firstHuman = new Human("Artem", "male", 60, null, null);
        Human secondHuman = new Human("Margo", "female", 62, null, null);
        Human thirdHuman = new Human("Anya", "female", 40, firstHuman, secondHuman);
        Human fourthHuman = new Human("Dmitriy", "male", 41, null, null);
        Human fivesHuman = new Human("Martin", "male", 12, fourthHuman, thirdHuman);
        Human sixHuman = new Human("Karim", "male", 10, fourthHuman, thirdHuman);

        family.addFamilyMember(firstHuman);
        family.addFamilyMember(secondHuman);
        family.addFamilyMember(thirdHuman);
        family.addFamilyMember(fourthHuman);
        family.addFamilyMember(fivesHuman);
        family.addFamilyMember(sixHuman);
        family.addFamilyMember(thirdHuman);

        return family;
    }

    public void addFamilyMember(String name, String sex, int age, int fatherInt, int motherInt) {
        Human father = fatherInt == -1 ? null : getMember(fatherInt, (member) -> (member.getSex() == "male"));
        Human mother = motherInt == -1 ? null : getMember(motherInt, (member) -> (member.getSex() == "female"));
        familyTree.addFamilyMember(new Human(name, sex, age, father, mother));
    }

    private FamilyTree<Human> load() {
        return (FamilyTree<Human>) fileManipulator.load("C:\\Users\\l.reva\\IdeaProjects\\Object_Oriented_Programming\\src\\Homework1\\savedTree.txt", "FamilyTree");
    }

    public void save() {
        fileManipulator.save("C:\\Users\\l.reva\\IdeaProjects\\Object_Oriented_Programming\\src\\Homework1\\savedTree.txt", "FamilyTree");
    }

    public void sortByChildrensAmount(ArrayList collection) {
        collection.sort(new ChildrensComparator<>());
    }

    public void sortByAge(ArrayList collection) {
        collection.sort(new AgeComparator<>());
    }

    private String getNames(Predicate predicate) {
        List<Human> members = familyTree.getMembers(predicate);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < members.size(); i++) {
            builder.append("\t|> ");
            builder.append(i + 1);
            builder.append(". ");
            builder.append(members.get(i).getShortDescription());
            builder.append("\n");
        }
        return builder.toString();
    }

    public String getMembersNames() {
        return getNames((member) -> true);
    }

    private Human getMember(int index, Predicate predicate) {
        return familyTree.getMembers(predicate).get(index);
    }

    public String getMaleNames() {
        return getNames((member) -> member.getSex() == "male");
    }

    public String getFemaleNames() {
        return getNames((member) -> member.getSex() == "female");
    }

    public String getMaleName(int index) {
        return familyTree.getMembers((member) -> member.getSex() == "male").get(index).getName();
    }

    public String getFemaleName(int index) {
        return familyTree.getMembers((member) -> member.getSex() == "female").get(index).getName();
    }

    public int getMaleAmount() {
        return familyTree.getMembers((member) -> member.getSex() == "male").size();
    }

    public int getFemaleAmount() {
        return familyTree.getMembers((member) -> member.getSex() == "female").size();
    }

    public int getAllAmount() {
        return familyTree.getMembers((member) -> true).size();
    }

    public String getMemberDetail(int index) {
        return familyTree.getMembers((member) -> true).get(index).toString();
    }
}