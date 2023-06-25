package test_1_task_3;

import test_1_task_3.presenter.Presenter;
import test_1_task_3.ui.ConsoleUI;
import test_1_task_3.ui.View;

public class main {
    public static void main(String[] args){
        View view = new ConsoleUI();
        Service service = new Service();
        Presenter presenter = new Presenter(view, service);

        view.start();
    }
}
