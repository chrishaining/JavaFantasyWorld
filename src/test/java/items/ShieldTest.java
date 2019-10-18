package items;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShieldTest {

    Shield shield;
    @Before
    public void before() {
        shield = new Shield(5);
    }

    @Test
    public void canGetType() {
        assertEquals("Defend", shield.getType());
    }
}


