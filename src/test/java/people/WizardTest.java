package people;

import weapons.JokeBook;
import weapons.Sword;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WizardTest {

    Wizard wizard;
    Sword sword;
    JokeBook jokeBook;

    @Before
    public void before() {
        sword = new Sword(3);
        jokeBook = new JokeBook(4);
        wizard = new Wizard("Symbolene");
    }

    @Test
    public void hasName() {
        assertEquals("Symbolene", wizard.getName());
    }

    @Test
    public void canSetWeapon() {
        wizard.setWeapon(sword);
        assertEquals(sword, wizard.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        wizard.setWeapon(sword);
        wizard.setWeapon(jokeBook);
        assertEquals(jokeBook, wizard.getWeapon());
    }

    @Test
    public void canAccessWeaponPower() {
        wizard.setWeapon(jokeBook);
        assertEquals(4, wizard.getWeaponPower());
    }

    //can get simple name



    @Test
    public void canFight() {
        wizard.setWeapon(jokeBook);
        assertEquals("Symbolene attacks with a JokeBook. It has a power level of 4.", wizard.fight());
    }

}
