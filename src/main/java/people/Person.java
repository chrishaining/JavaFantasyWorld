package people;

import behaviours.IFight;
import weapons.Weapon;

public abstract class Person implements IFight {

    public String name;
    public Weapon weapon;

    public Person(String name) {
        this.name = name;
        this.weapon = null;
    }

    public String getName() {
        return name;
    }

    //setting the weapon means that we can add or replace an weapon. extension is to have an array of weapons.
    public void setWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getWeaponPower() {
        return this.weapon.getPower();
    }

}