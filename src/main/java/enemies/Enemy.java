package enemies;

import behaviours.IFight;

public abstract class Enemy implements IFight {

    private String name;
    private int power;

    public Enemy(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public abstract String giveWarning();

    public String getClassSimpleName() {
        return this.getClass().getSimpleName();
    }

    public String fight() {
        return String.format("%s %s attacks with a power level of %s.", this.giveWarning(), this.getName(), this.getPower());
    }

}
