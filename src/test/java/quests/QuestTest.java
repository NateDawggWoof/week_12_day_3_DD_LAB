package quests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestTest {
    private Quest quest;

    @Before
    public void before(){
        quest = new Quest("My First Quest");
    }

    @Test
    public  void  hasName(){
        assertEquals("My First Quest", quest.getName());
    }

    @Test
    public  void  hasRooms(){
        assertEquals(0, quest.countRooms());
    }
}
