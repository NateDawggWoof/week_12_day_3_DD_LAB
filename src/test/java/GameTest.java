import org.junit.Before;
import org.junit.Test;
import quests.Quest;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private  Game game;
    public Quest quest1;

    @Before
    public void before(){
        game = new Game(quest1);
    }

    @Test
    public void hasHeros(){
        assertEquals(0, game.countHeroes());
    }

    @Test
    public void hasRooms(){
        assertEquals(0, game.getQuest().countRooms());
    }
}
