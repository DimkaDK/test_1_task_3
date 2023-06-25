package test_1_task_3.ui;

import java.util.Scanner;

import test_1_task_3.presenter.Presenter;

public class ConsoleUI implements View{

    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private Menu menu;

    public ConsoleUI () {
        scanner = new Scanner(System.in);
        work = true;
        menu = new Menu(this);
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        while (work){
            System.out.println(menu.print());
            String choice = scanner.nextLine();
            if(check(choice)){
                menu.execute(Integer.parseInt(choice));
            }
            else{
                fail();
            }
        }
    }

    private boolean check(String text){
        return text.matches("[0-9]+") && Integer.parseInt(text) <= menu.getSize() && Integer.parseInt(text) > 0;
    }

    private void fail(){
        System.out.println("Неверный ввод");
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;       
    }

    void addToy(){  
        presenter.add();
    }

    void showToy(){
        presenter.show();
    }

    void drawToy(){
        presenter.draw();
    }

    void finish(){
        work = false;
    }
    
}
