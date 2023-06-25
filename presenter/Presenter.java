package test_1_task_3.presenter;


import test_1_task_3.Service;
import test_1_task_3.ui.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void add(){
       service.addToy();
       view.print("Игрушка добавлена в розыгрыш\n");
    }

    public void show(){
       String text = service.showToy();
       view.print(text);
    }

    public void draw(){
        String text = service.drawToy();
        view.print(text);       
    }
    
    
}
