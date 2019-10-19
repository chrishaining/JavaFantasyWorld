package enemies;

public class Heckler extends Enemy {

    public Heckler(String name, int power) {
        super(name, power);
    }

    public String giveWarning() {
        return "Booo! You suck!";
    }
}
