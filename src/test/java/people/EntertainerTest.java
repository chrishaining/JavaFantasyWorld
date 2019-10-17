package people;

import creatures.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EntertainerTest {

    Entertainer entertainer;
    Dragon dragon;

    @Before
    public void before() {
        dragon = new Dragon("Bert");
        entertainer = new Entertainer("Flamboyo", dragon);
    }

    @Test
    public void hasName() {
        assertEquals("Flamboyo", entertainer.getName());
    }

    @Test
    public void hasCreature() {
        assertEquals(dragon, entertainer.getCreature() );
    }
}
