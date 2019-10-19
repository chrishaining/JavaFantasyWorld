package weapons;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SwordTest {

    Sword sword;

    @Before
    public void before() {
        sword = new Sword(3);
    }

    @Test
    public void hasPower() {
        assertEquals(3, sword.getPower());
    }

}
