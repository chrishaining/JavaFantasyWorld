package people;

import org.junit.Before;
import org.junit.Test;
import weapons.Joke;
import weapons.Sword;

import static org.junit.Assert.*;

public class WarriorTest {

    Warrior warrior;
    Sword sword;
    Joke joke;

    @Before
    public void before() {

        sword = new Sword(3);
        joke = new Joke(4);
        warrior = new Warrior("Chestnutella");
    }

    @Test
    public void hasName() {
        assertEquals("Chestnutella", warrior.getName());
    }


    @Test
    public void canSetWeapon() {
        warrior.setWeapon(sword);
        assertEquals(sword, warrior.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        warrior.setWeapon(sword);
        warrior.setWeapon(joke);
        assertEquals(joke, warrior.getWeapon());
    }

    @Test
    public void canAccessWeaponPower() {
        warrior.setWeapon(joke);
        assertEquals(4, warrior.getWeaponPower());
    }

    @Test
    public void canShowWeaponSimpleName() {
        warrior.setWeapon(joke);
        assertEquals("Joke", warrior.getWeaponSimpleName());
    }

    @Test
        public void canFight() {
        warrior.setWeapon(joke);
        assertEquals("I attack thee with a Joke. It has a power level of 4.", warrior.fight());
    }
}