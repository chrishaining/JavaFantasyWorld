package creatures;

public abstract class Creature {

    public String name;

    public Creature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
