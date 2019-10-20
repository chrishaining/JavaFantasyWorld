package people;

import org.junit.Before;
import org.junit.Test;
import weapons.JokeBook;
import weapons.Sword;

import static org.junit.Assert.*;

public class WarriorTest {

    Warrior warrior;
    Sword sword;
    JokeBook jokeBook;

    @Before
    public void before() {

        sword = new Sword(3);
        jokeBook = new JokeBook(4);
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
        warrior.setWeapon(jokeBook);
        assertEquals(jokeBook, warrior.getWeapon());
    }

    @Test
    public void canAccessWeaponPower() {
        warrior.setWeapon(jokeBook);
        assertEquals(4, warrior.getWeaponPower());
    }

    @Test
    public void canShowWeaponSimpleName() {
        warrior.setWeapon(jokeBook);
        assertEquals("JokeBook", warrior.getWeaponSimpleName());
    }


    //can get simple name

    @Test
        public void canFight() {
        warrior.setWeapon(jokeBook);
        assertEquals("Chestnutella attacks with a JokeBook. It has a power level of 4.", warrior.fight());
    }
}