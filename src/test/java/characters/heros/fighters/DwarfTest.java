package characters.heros.fighters;

import characters.enemies.Orc;
import characters.heros.fighterClasses.Dwarf;
import items.ClassTypes;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DwarfTest {

    private Dwarf dwarf;
    private Orc orc;
    private Weapon axe;

    @Before
    public void before(){

        dwarf = new Dwarf("Dooren",100, 10, 9,5);

        orc = new Orc("Urtz",150, 10, 5,5);

        axe = new Weapon("My Axe", ClassTypes.FIGHTER,25);
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
        assertEquals(9, dwarf.getDefence());
    }

    @Test
    public void hasAgility(){
        assertEquals(5, dwarf.getAgility());
    }

    @Test
    public void hasSlot1(){
        assertNull(dwarf.getSlot1());
    }

    @Test
    public void slot1HasAxe(){
        dwarf.equip(1,axe);
        assertEquals(axe,dwarf.getSlot1());
    }

    @Test
    public void hasSlot2(){
        assertNull(dwarf.getSlot2());
    }

    @Test
    public void hasInventory(){
        assertEquals(0, dwarf.countInventory());
    }

    @Test
    public void hasBattleCry(){
        assertEquals("Khayamu!!!", dwarf.battleCry());
    }

    @Test
    public void hasAttack(){
        dwarf.attack(orc);
        assertEquals(145, orc.getHp());
    }

    @Test
    public void hasAttackwithAxe(){
        dwarf.equip(1,axe);
        dwarf.attack(orc);
        assertEquals(120, orc.getHp());
    }



}
