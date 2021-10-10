package characters;

import items.Item;
import items.Weapon;

import java.util.ArrayList;

public abstract class GameCharacter {


    private String name;
    private int hp;
    private int strength;
    private int defence;
    private int agility;
    private Item slot1;
    private Item slot2;
    private ArrayList<Item> inventory;




    public GameCharacter(String name, int hp, int strength, int defence, int agility) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.defence = defence;
        this.agility = agility;
        this.inventory = new ArrayList<>();
        this.slot1 = null;
        this.slot2 = null;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public Item getSlot1() {
        return slot1;
    }

    public void setSlot1(Item slot1) {
        this.slot1 = slot1;
    }

    public Item getSlot2() {
        return slot2;
    }

    public void setSlot2(Item slot2) {
        this.slot2 = slot2;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public int countInventory(){
        return this.inventory.size();
    }

    public Weapon getWeapon(){
        if(getSlot1() instanceof Weapon){
            return (Weapon) getSlot1();
        }
        return null;
    }
}
