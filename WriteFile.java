package test_1_task_3;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

public class WriteFile {
    static void writeData(Map<Integer, Toy> hashmap, String file){
       
        for(Map.Entry<Integer, Toy> item: hashmap.entrySet()){
            try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true),"UTF8")))
            {
                bw.write(item.getKey() + ":" + item.getValue().getName() + ":" + item.getValue().getQuantity() + ":" + item.getValue().getChance()+ "\n");
            }
            catch(IOException ex){
                
                System.out.println(ex.getMessage());
            }
        }
    }
}
