package people;

import org.junit.Before;
import org.junit.Test;
import weapons.Joke;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class EntertainerTest {

    Entertainer entertainer;
    Sword sword;
    Joke joke;

    @Before
    public void before() {
        entertainer = new Entertainer("Flamboyo");
        sword = new Sword(3);
        joke = new Joke(4);
    }

    @Test
    public void hasName() {
        assertEquals("Flamboyo", entertainer.getName());
    }

    @Test
    public void canSetWeapon() {
        entertainer.setWeapon(sword);
        assertEquals(sword, entertainer.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        entertainer.setWeapon(sword);
        entertainer.setWeapon(joke);
        assertEquals(joke, entertainer.getWeapon());
    }

    @Test
    public void canAccessWeaponPower() {
        entertainer.setWeapon(joke);
        assertEquals(4, entertainer.getWeaponPower());
    }

    @Test
    public void canFight() {
        entertainer.setWeapon(joke);
        assertEquals("I attack thee with a Joke. It has a power level of 4.", entertainer.fight());
    }
}
