package people;

import weapons.Joke;
import weapons.Sword;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WizardTest {

    Wizard wizard;
    Sword sword;
    Joke joke;

    @Before
    public void before() {
        sword = new Sword(3);
        joke = new Joke(4);
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
        wizard.setWeapon(joke);
        assertEquals(joke, wizard.getWeapon());
    }

    @Test
    public void canAccessWeaponPower() {
        wizard.setWeapon(joke);
        assertEquals(4, wizard.getWeaponPower());
    }

    //can get simple name



    @Test
    public void canFight() {
        wizard.setWeapon(joke);
        assertEquals("I attack thee with a Joke. It has a power level of 4.", wizard.fight());
    }

}
