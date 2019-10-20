package people;

import behaviours.IFight;
import weapons.Weapon;

public abstract class Person implements IFight {

    private String name;
    private Weapon weapon;

    public Person(String name) {
        this.name = name;
        this.weapon = null;
    }

    public String getName() {
        return name;
    }

    public void setWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public String getWeaponSimpleName() {
        return this.weapon.getClass().getSimpleName();
    }

    public String getClassSimpleName() {
        return this.getClass().getSimpleName();
    }

    public int getWeaponPower() {
        return this.weapon.getPower();
    }

    public String getWeaponNoise() {
        return this.weapon.getNoise().toUpperCase();
    }

    public String fight() {
        return String.format("%s attacks with a %s. %s! It has a power level of %s.", this.getName(), this.getWeaponSimpleName(), this.getWeaponNoise(), this.getWeaponPower());
    }

}