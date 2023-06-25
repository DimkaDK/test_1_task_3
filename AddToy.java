package test_1_task_3;

import java.util.Map;
import java.util.Scanner;

public class AddToy  { 
    static void addToy(Map<Integer, Toy> hashmap, String file){

        int id = 0;
        String name;
        int quantity;
        int chance;
        Scanner scanner = new Scanner(System.in);   
        
        ReadFile.readData(hashmap, file);
        
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

        WriteFile.writeData(hashmap, file);
    }
}
