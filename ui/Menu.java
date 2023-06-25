package test_1_task_3.ui;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Command> list;

    public Menu(ConsoleUI consoleUI){
        list = new ArrayList<>();
        list.add(new addToy(consoleUI));
        list.add(new ShowToys(consoleUI));
        list.add(new DrawToy(consoleUI));
        list.add(new Finish(consoleUI));
    }

    public String print(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++){
            sb.append(i + 1);
            sb.append(". ");
            sb.append(list.get(i).getDescription());
            sb.append("\n");
        }
        return sb.toString();
    }

    public int getSize(){
        return list.size();
    }

    void execute(int choice){
        list.get(choice - 1).execute();
    }
}
