package items;

import org.junit.Before;
import org.junit.Test;

import javax.jws.WebParam;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    private Weapon axe;

    @Before
    public void before(){
        axe = new Weapon("My Axe", ClassTypes.FIGHTER,25);

    }

    @Test
    public void hasName(){
        assertEquals("My Axe", axe.getName());
    }

    @Test
    public void hasClassType(){
        assertEquals(ClassTypes.FIGHTER, axe.getClassType());
    }

    @Test
    public void hasDamage(){
        assertEquals(25, axe.getDamage());
    }
}
