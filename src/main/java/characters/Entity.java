package characters;

import behaviors.IAttack;
import behaviors.ICollect;
import behaviors.IContent;
import items.Item;
import types.CharacterType;

import java.util.ArrayList;

public abstract class Entity implements IAttack, ICollect, IContent {
    private CharacterType characterType;
    private ArrayList<Item> inventory;
    private int health;

    public Entity(CharacterType characterType) {
        this.characterType = characterType;
        this.inventory = new ArrayList<>();
        this.health = this.characterType.getHealth();
    }
    public int getHealth() {
        return this.health;
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

    public boolean inventoryContains(Item item) {
        return this.inventory.contains(item);
    }

    public void setHealth(int newHealth) {
        this.health = newHealth;
    }
}
