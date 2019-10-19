package enemies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DragonTest {

    Dragon dragon;

    @Before
    public void before() {
        dragon = new Dragon("Gordon",5);
    }

    @Test
    public void hasName() {
        assertEquals("Gordon", dragon.getName());
    }


    @Test
    public void hasPower() {
        assertEquals(5, dragon.getPower());
    }

    @Test
    public void canGiveClassName() {
        assertEquals("Dragon", dragon.getClassSimpleName());
    }

    @Test
    public void canGiveWarning() {
        assertEquals("ROAR!", dragon.giveWarning());
    }

    @Test
    public void canFight() {
        assertEquals("ROAR! You've just been Dragon-ed with a power level of 5.", dragon.fight());
    }

}
