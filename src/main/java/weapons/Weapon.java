package weapons;

public abstract class Weapon {

    private int power;

    private String type;
    public Weapon(int power) {
        this.power = power;

    }

    public int getPower() {
        return power;
    }

}
