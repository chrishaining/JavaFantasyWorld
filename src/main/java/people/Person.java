package people;

import creatures.Creature;

public abstract class Person {

    public String name;
    public Creature creature;

    public Person(String name, Creature creature) {
        this.name = name;
        this.creature = creature;
    }

    public String getName() {
        return name;
    }

    public Creature getCreature() {
        return creature;
    }
}
