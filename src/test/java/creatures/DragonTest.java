package creatures;

import creatures.Dragon;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DragonTest {

    Dragon dragon;

    @Before
    public void before() {
        dragon = new Dragon("Gordon");
    }

    @Test
    public void hasName() {
        assertEquals("Gordon", dragon.getName());
    }

}
