package characters.fighters;

import characters.fighterClasses.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Dooren");
    }

    @Test
    public void hasName(){
        assertEquals("Dooren", dwarf.getName());
    }

}
