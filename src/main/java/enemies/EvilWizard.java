package enemies;

public class EvilWizard extends Enemy {

    public EvilWizard(String name, int power) {
        super(name, power);
    }

    public String giveWarning() {
        return "You dare to challenge me!";
    }
}
