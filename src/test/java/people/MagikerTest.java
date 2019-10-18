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

    @Test
    public void canDefendAgainstAttackIfItemIsDefenderAndShowStringUnharmed() {
        magiker.setItem(shield);
//        magiker.defend(3);
        assertEquals( "Ha! Your attack had no effect! My Shield overcomes your weapon.", magiker.defend(3));
    }

    @Test
    public void canDefendAgainstAttackIfItemIsDefenderAndShowStringWounded() {
        magiker.setItem(shield);
        assertEquals( "Your attack has wounded me, but I'm not dead yet.", magiker.defend(6));
    }

    @Test
    public void canDefendAgainstAttackIfItemIsDefenderAndShowStringKilled() {
        magiker.setItem(shield);
        assertEquals( "Aaagh! I die, but I will come back to haunt thee!", magiker.defend(11));
    }
}
