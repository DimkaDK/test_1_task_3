package test_1_task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class ReadFile {
    static Map<Integer, Toy> readData(Map<Integer, Toy> hashmap, String file){
        try(BufferedReader br = new BufferedReader (new FileReader(file)))
        {
            String line;          
            
            while((line = br.readLine())!=null){                    
                            
                String[] data = line.split(":");
                
                Toy toy = new Toy(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]));
                
                hashmap.put(Integer.parseInt(data[0]), toy);                              
            }
        }
        catch(IOException e){             
            System.out.println(e.getMessage());
        }
        try (PrintWriter pw = new PrintWriter(file)){
        } catch (IOException e) {
            e.printStackTrace();
        }
       
        return hashmap;       

    }
    
}
