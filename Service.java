package test_1_task_3;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Service {    
    private Map<Integer, Toy> hashmap;
    private String fileData;
    private String fileDraw;
    private Scanner scanner;

    public Service(){
        hashmap = new HashMap<>();
        fileData = "./test_1_task_3/data.txt";
        fileDraw = "./test_1_task_3/draw.txt";
        scanner = new Scanner(System.in);
    }

    public void addToy(){
        ReadFile.readData(hashmap, fileData);
      
        int id = 0;
        String name;
        int quantity;
        int chance;
        
        while (hashmap.containsKey(id)){
            id++;
        }

        System.out.print("Введите название игрушки: ");
        name = scanner.nextLine();
        System.out.print("Введите колл-во игрушек для розыгрыша: ");
        quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите частоту выпадения (число от 0 до 100): ");
        chance = Integer.parseInt(scanner.nextLine());

        Toy toy = new Toy(id, name, quantity, chance);        
       
        hashmap.put(id, toy);

        WriteFile.writeData(hashmap, fileData);

    }

    public String showToy(){
        ReadFile.readData(hashmap, fileData);
        String text = "";

        for(Map.Entry<Integer, Toy> item: hashmap.entrySet()){
            text += item.getValue().toString() + "\n";
        }

        WriteFile.writeData(hashmap, fileData);
        return text;
    }

    public String drawToy(){
        Map<Integer, Toy> hashDraw = new HashMap<>();
        int id = 0;
        int j = 0;        

        ReadFile.readData(hashmap, fileData);
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

            WriteFile.writeData(hashmap, fileData);

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
