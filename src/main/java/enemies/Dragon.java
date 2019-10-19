package enemies;

public class Dragon extends Enemy {

    public Dragon(String name, int power) {
        super(name, power);
    }

    public String giveWarning() {
        return "ROAR!";
    }
}


