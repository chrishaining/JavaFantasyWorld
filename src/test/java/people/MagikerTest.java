package people;

import creatures.Dragon;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MagikerTest {

    Magiker magiker;
    Dragon dragon;

    @Before
    public void before() {
        dragon = new Dragon("Bert");
        magiker = new Magiker("Symbolene", dragon);
    }

    @Test
    public void hasName() {
        assertEquals("Symbolene", magiker.getName());
    }

    @Test
    public void hasCreature() {
        assertEquals(dragon, magiker.getCreature() );
    }
}
