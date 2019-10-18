package items;

public abstract class AttackItem extends Item {

    private String type;

    public AttackItem(int power) {
        super(power);
        this.type = "Attack";
    }

    public String getType() {
        return type;
    }
}
