package test_1_task_3.ui;

import test_1_task_3.presenter.Presenter;

public interface View {
    void print(String text);
    void start();
    void setPresenter(Presenter presenter);
}
