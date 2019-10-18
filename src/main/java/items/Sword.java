package items;

public class Sword extends Item {

    private String action;
    public Sword(int power) {
        super(power);
        this.action = "attack";
    }

    public String getAction() {
        return action;
    }
}
