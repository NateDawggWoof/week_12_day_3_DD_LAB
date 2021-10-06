package quests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room;

    @Before
    public void before(){
        room = new Room("Entrance");
    }

    @Test
    public void hasName(){
        assertEquals("Entrance", room.getName());
    }

    @Test
    public void hasEnemies(){
        assertEquals(0, room.countEnemies());
    }

    @Test
    public void hasItems(){
        assertEquals(0, room.countItems());
    }


}
