package Homework1.presenter;

import Homework1.model.FamilyTree;
import Homework1.model.Service;
import Homework1.view.View;

public class Presenter {

    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public FamilyTree getService() {
        return (FamilyTree) service;
    }
}
