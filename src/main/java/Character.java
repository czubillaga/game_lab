import java.util.ArrayList;

public abstract class Character implements IAttack, ICollect{
    private int health;
    private ArrayList<Item> inventory;

    public Character(int health) {
        this.health = health;
        this.inventory = new ArrayList<>();
    }
    public int getHealth() {
        return health;
    }
    public ArrayList<Item> getInventory() {
        return inventory;
    }
    public void addToInventory(Item item){
        this.inventory.add(item);
    }

    public void decreaseHealth(int i){
        this.health -= i;
    }
}
