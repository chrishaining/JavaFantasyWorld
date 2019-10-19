package weapons;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MagicSpellTest {

    MagicSpell magicSpell;

    @Before
    public void before() {
        magicSpell = new MagicSpell(5);
    }

    @Test
    public void hasPower() {
        assertEquals(5, magicSpell.getPower());
    }
}