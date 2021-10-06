package characters.fighters;

import characters.fighterClasses.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Dooren",100, 10, 15,5);
    }

    @Test
    public void hasName(){
        assertEquals("Dooren", dwarf.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(100, dwarf.getHp());
    }

    @Test
    public void hasStrength(){
        assertEquals(10, dwarf.getStrength());
    }

    @Test
    public void hasDefense(){
        assertEquals(15, dwarf.getDefence());
    }

    @Test
    public void hasAgility(){
        assertEquals(5, dwarf.getAgility());
    }

//    @Test
//    public void hasSlot1(){
//        assertEquals(0, dwarf.getCountSlot1());
//    }
//
//    @Test
//    public void hasSlot2(){
//        assertEquals(0, dwarf.getCountSlot2());
//    }



}
