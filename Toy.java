package test_1_task_3;

public class Toy {
    private int id;
    private String name;
    private int quantity;
    private int chance;    

    public Toy(int id, String name, int quantity, int chance) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.chance = chance;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getChance() {
        return chance;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setChance(int chance) {
        this.chance = chance;
    }
    @Override
    public String toString() {
        return "Имя игрушки: " + name + ", колл-во = " + quantity + ", вес для розыгрыша = " + chance + "\n";
    }

    
    

    
    
}
