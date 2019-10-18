import items.Sword;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

//package items;

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

    @Test
    public void canGetType() {
        assertEquals("Attack", sword.getType());
    }

}
