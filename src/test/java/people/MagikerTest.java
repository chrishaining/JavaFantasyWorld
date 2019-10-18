package people;

import creatures.Dragon;
import items.Shield;
import items.Sword;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MagikerTest {

    Magiker magiker;
    Dragon dragon;
    Sword sword;
    Shield shield;

    @Before
    public void before() {
        dragon = new Dragon("Bert");
        sword = new Sword(3);
        shield = new Shield(4);
        magiker = new Magiker("Symbolene", dragon);
    }

    @Test
    public void hasName() {
        assertEquals("Symbolene", magiker.getName());
    }

    @Test
    public void hasCreature() {
        assertEquals(dragon, magiker.getCreature() );
    }

    @Test
    public void healthStartsAt5() {
        assertEquals(5, magiker.getHealth());
    }
    @Test
    public void canSetItem() {
        magiker.setItem(sword);
        assertEquals(sword, magiker.getItem());
    }

    @Test
    public void canChangeItem() {
        magiker.setItem(sword);
        magiker.setItem(shield);
        assertEquals(shield, magiker.getItem());
    }

    @Test
    public void canAttack() {
        magiker.setItem(sword);
        assertEquals("I attack thee with my " + sword + "!", magiker.attack());
    }

    @Test
    public void canAccessItemPower() {
        magiker.setItem(shield);
        assertEquals(4, magiker.getItemPower());
    }

//    @Test
//    public void canDefend() {
//        magiker.setItem(shield);
//        assertEquals("I defend with my " + shield + ".", magiker.defend());
//    }

//    @Test
//    public void canLoseHealth() {
//        magiker.loseHealth(3);
//        assertEquals(2, magiker.getHealth());
//    }

    @Test
    public void canDefendAgainstAttackIfItemIsDefender() {
        magiker.setItem(shield);
        magiker.defend(3);
        assertEquals(5, magiker.getHealth());
    }
}
