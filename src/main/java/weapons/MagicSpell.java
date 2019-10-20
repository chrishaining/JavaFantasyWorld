package weapons;

public class MagicSpell extends Weapon {

    public MagicSpell(int power){
        super(power);
    }

    public String getNoise() {
        return "I turn thee into a toad!";
    }

}
