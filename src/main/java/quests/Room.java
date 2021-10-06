package quests;

import characters.enemies.Enemy;
import items.Item;

import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<Enemy> enemies;
    private ArrayList<Item> items;


    public Room(String name) {
        this.name = name;
        this.enemies = new ArrayList<Enemy>();
        this.items = new ArrayList<Item>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public int countEnemies() {
        return enemies.size();
    }

    public int countItems() {
        return items.size() ;
    }
}
