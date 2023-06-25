package test_1_task_3;

import java.util.Map;

public class ShowToy {
    static String showToy(Map<Integer, Toy> hashmap, String file){
        ReadFile.readData(hashmap, file);
        String text = "";

        for(Map.Entry<Integer, Toy> item: hashmap.entrySet()){
            text += item.getValue().toString() + "\n";
        }

        WriteFile.writeData(hashmap, file);
        return text;
    }
}
