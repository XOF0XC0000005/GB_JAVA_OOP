package Homework1.presenter;

import Homework1.model.Service;
import Homework1.model.repo.FileHandler;

public class Presenter {

    private Service service;

    public Presenter() {
        service = new Service(new FileHandler());
    }

    public String getMembersNames() {
        return service.getMembersNames();
    }

    public String getMalesNames() {
        return service.getMaleNames();
    }

    public String getFemalesNames() {
        return service.getFemaleNames();
    }

    public int getMaleAmount() {
        return service.getMaleAmount();
    }

    public int getFemaleAmount() {
        return service.getFemaleAmount();
    }

    public int getAllMembersAmount() {
        return service.getAllAmount();
    }


    public String getMaleName(int index) {
        return service.getMaleName(index);
    }

    public String getFemaleName(int index) {
        return service.getFemaleName(index);
    }

    public String getMemberDetail(int index) {
        return service.getMemberDetail(index);
    }

    public void save() {
        service.save();
    }

    public void addNewMember(String name, String sex, int age, int father, int mother) {
        service.addFamilyMember(name, sex, age, father, mother);
    }
}