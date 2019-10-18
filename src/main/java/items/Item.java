package items;

public abstract class Item {

    private int power;

    private String type;
    public Item(int power) {
        this.power = power;
        this.type = null;

    }

    public int getPower() {
        return power;
    }


    public String getType() {
        return type;
    }
}
