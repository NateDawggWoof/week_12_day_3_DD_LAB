package characters;

import java.util.ArrayList;

public abstract class GameCharacter {


    private String name;
    private int hp;
    private int strength;
    private int defence;
    private int agility;
//    private Item slot1;
//    private Item slot2;
//    private ArrayList<Item> inventory;



    public GameCharacter(String name, int hp, int strength, int defence, int agility) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.defence = defence;
        this.agility = agility;

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
}
