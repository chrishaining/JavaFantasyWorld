package people;

import creatures.Dragon;
import items.Shield;
import items.Sword;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MagikerTest {

    Magiker magiker;
    Dragon dragon;
    Sword sword;
    Shield shield;

    @Before
    public void before() {
        dragon = new Dragon("Bert");
        sword = new Sword(3);
        shield = new Shield(4);
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

    @Test
    public void canSetItem() {
        magiker.setItem(sword);
        assertEquals(sword, magiker.getItem());
    }

    @Test
    public void canChangeItem() {
        magiker.setItem(sword);
        magiker.setItem(shield);
        assertEquals(shield, magiker.getItem());
    }
}
