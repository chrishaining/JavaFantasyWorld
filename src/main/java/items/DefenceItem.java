package items;

public class DefenceItem extends Item {

    private String type;

    public DefenceItem(int power) {
        super(power);
        this.type = "Defend";
    }

    public String getType() {
        return type;
    }
}
