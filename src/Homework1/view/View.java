package Homework1.view;

import Homework1.presenter.Presenter;

public interface View {

    void print(String text);
    void setPresenter(Presenter presenter);
    void start();
}
