package quests;

import java.security.PrivateKey;
import java.util.ArrayList;

public class Quest {

    private String name;

    private ArrayList<Room> rooms;

    public Quest(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int countRooms() {
        return this.rooms.size();
    }
}
