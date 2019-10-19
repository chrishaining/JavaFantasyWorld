package enemies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HecklerTest {

    Heckler heckler;

    @Before
    public void before() {
        heckler = new Heckler("Schmuck", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Schmuck", heckler.getName());
    }

    @Test
    public void hasPower() {
        assertEquals(2, heckler.getPower());
    }

    @Test
    public void canGiveClassName() {
        assertEquals("Heckler", heckler.getClassSimpleName());
    }

    @Test
    public void canGiveWarning() {
        assertEquals("Booo! You suck! I'm gonna make you wish you had stayed at home.", heckler.giveWarning());
    }

    @Test
    public void canFight() {
        assertEquals("Booo! You suck! I'm gonna make you wish you had stayed at home. You've just been Heckler-ed with a power level of 2.", heckler.fight());
    }

}
