package people;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MagikerTest {

    Magiker magiker;

    @Before
    public void before() {
        magiker = new Magiker("Symbolene");
    }

    @Test
    public void hasName() {
        assertEquals("Symbolene", magiker.getName());
    }
}
