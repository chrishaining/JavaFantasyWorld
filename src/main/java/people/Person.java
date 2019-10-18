package people;

import creatures.Creature;
import items.Item;

public abstract class Person {

    public String name;
    public Creature creature;
    public Item item;

    public Person(String name, Creature creature) {
        this.name = name;
        this.creature = creature;
        this.item = null;
    }

    public String getName() {
        return name;
    }

    public Creature getCreature() {
        return creature;
    }

    //setting the item means that we can add or replace an item. extension is to have an array of items.
    public void setItem(Item newItem) {
        this.item = newItem;
    }

    public Item getItem() {
        return item;
    }
}
