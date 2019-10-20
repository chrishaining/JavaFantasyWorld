package people;

import org.junit.Before;
import org.junit.Test;
import weapons.JokeBook;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class EntertainerTest {

    Entertainer entertainer;
    Sword sword;
    JokeBook jokeBook;

    @Before
    public void before() {
        entertainer = new Entertainer("Flamboyo");
        sword = new Sword(3);
        jokeBook = new JokeBook(4);
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
        entertainer.setWeapon(jokeBook);
        assertEquals(jokeBook, entertainer.getWeapon());
    }

    @Test
    public void canAccessWeaponPower() {
        entertainer.setWeapon(jokeBook);
        assertEquals(4, entertainer.getWeaponPower());
    }

    //can get simple name

    @Test
    public void canFight() {
        entertainer.setWeapon(jokeBook);
        assertEquals("Flamboyo attacks with a JokeBook. It has a power level of 4.", entertainer.fight());
    }
}
