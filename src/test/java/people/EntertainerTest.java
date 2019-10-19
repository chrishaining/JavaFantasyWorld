package people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EntertainerTest {

    Entertainer entertainer;

    @Before
    public void before() {
        entertainer = new Entertainer("Flamboyo");
    }

    @Test
    public void hasName() {
        assertEquals("Flamboyo", entertainer.getName());
    }


}
