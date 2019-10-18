package people;

import behaviours.IAttack;
import behaviours.IDefend;
import behaviours.ILoseHealth;
import creatures.Creature;
import items.Item;

public abstract class Person implements IAttack, IDefend, ILoseHealth {

    public String name;
    public Creature creature;
    public Item item;
    public int health;

    public Person(String name, Creature creature) {
        this.name = name;
        this.creature = creature;
        this.item = null;
        this.health = 5;
    }

    public String getName() {
        return name;
    }

    public Creature getCreature() {
        return creature;
    }

    public int getHealth() {
        return health;
    }

    //setting the item means that we can add or replace an item. extension is to have an array of items.
    public void setItem(Item newItem) {
        this.item = newItem;
    }

    public Item getItem() {
        return item;
    }

    public int getItemPower() {
        return this.item.getPower();
    }

    //should it be this.getItem?
    public String attack() {
        return String.format("I attack thee with my %s!", this.item);
    }

//    public String defend() {
//        return String.format("I defend with my %s.", this.item);
//    }

    //DEFEND METHOD
    //THIS WILL BE CALLED AFTER SOMEONE IS ATTACKED.
    //first, the method will need to take in a potential damage level (int)
    //some form of conditional to check whether the person has a defend item.
    //if the person has a defend item, then compare the power of the item versus the power of the attack.
    //if attack power > than defend power, reduce health by (attack power - defend power)
    //if attack power < defend power, health is unaffected (or the item power could be reduced by attack power?)
    // if attack power = defend power, health is unaffected (or the item power could be reduced by attack power)
    // return a string appropriate to the outcome - Ha! Your attack had no effect! / Your attack has wounded me, but I'm not dead yet. / Aaagh! You have defeated me!

    public String defend(int damage) {
        if (this.item.getType() == "Defend") {
            return this.item.getType();
        }
        else return "Not a defender";
    }


//    public String defend(int damage) {
//        if (this.item.getType() == "Defend") {
//            if (this.item.getPower() >= damage) {
//                return String.format("Ha! Your attack had not effect! My %s overcomes your weapon.", this.getItem());
//            } else if (this.item.getPower() < damage) {
//                this.health -= (damage - this.item.getPower());
//                if (this.health > 0) {
//                    return "Your attack has wounded me, but I'm not dead yet.";
//                } else {
//                    return "Aaagh! I die, but I will come back to haunt thee!";
//                }
//            }
//        } return "ooooo";
//    }
//        public void loseHealth(int damage) {
//            this.health -= damage;
//        }

}