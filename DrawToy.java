package test_1_task_3;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class DrawToy {
    static String drawToy(Map<Integer, Toy> hashmap, String file){
        Map<Integer, Toy> hashDraw = new HashMap<>();
        String fileDraw = "./test_1_task_3/draw.txt";
        int id = 0;
        int j = 0;        

        ReadFile.readData(hashmap, file);
        while (hashmap.containsKey(id)){
            for(int i = 0; i < hashmap.get(id).getChance(); i++){
                if (hashmap.get(id).getQuantity() > 0){
                    hashDraw.put(j, hashmap.get(id));
                    j++;                    
                }
            }
            id++;
        }
        
        if(j != 0){

            double a = Math.random()*(j);
            int win = (int) Math.round(a);

            Toy winner = hashDraw.get(win);
            hashDraw.clear();
            winner.setQuantity(winner.getQuantity() - 1);       

            hashmap.put(winner.getId(), winner);

            WriteFile.writeData(hashmap, file);

            try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDraw, true),"UTF8")))
                {
                    bw.write("Выпала игрушка: " + winner.getName() + "\n");
                }
                catch(IOException ex){
                    
                    System.out.println(ex.getMessage());
                }

            return "Выпала игрушка: " + winner.getName() + "\n";
        }
        else{
            return "Розыгрыш завершен" + "\n";
        }      

    }
    
}
