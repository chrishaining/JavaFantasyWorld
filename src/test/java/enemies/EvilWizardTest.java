package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvilWizardTest {

    EvilWizard evilWizard;

    @Before
    public void before() {
        evilWizard = new EvilWizard("Sargob", 1);
    }

    @Test
    public void hasName() {
        assertEquals("Sargob", evilWizard.getName());
    }

    @Test
    public void hasPower() {
        assertEquals(1, evilWizard.getPower());
    }
    @Test
    public void canGiveWarning() {
        assertEquals("You dare to challenge me!", evilWizard.giveWarning());
    }

    @Test
    public void canGiveClassName() {
        assertEquals("EvilWizard", evilWizard.getClassSimpleName());
    }

    @Test
    public void canFight() {
        assertEquals("You dare to challenge me! You've just been EvilWizard-ed with a power level of 1.", evilWizard.fight());
    }

}
