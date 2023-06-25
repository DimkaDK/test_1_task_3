package test_1_task_3;

import java.util.HashMap;
import java.util.Map;

public class Service {    
    Map<Integer, Toy> hashmap = new HashMap<>();
    String fileData = "./test_1_task_3/data.txt";
       

    public void addToy(){
        AddToy.addToy(hashmap, fileData);
    }

    public String showToy(){
        String text = ShowToy.showToy(hashmap, fileData);
        return text;
    }

    public String drawToy(){
        String text = DrawToy.drawToy(hashmap, fileData);
        return text;
    }
}
