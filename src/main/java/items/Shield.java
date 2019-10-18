package items;

public class Shield extends Item {

    private String action;
    public Shield(int power) {
        super(power);
        this.action = "defend";
    }

    public String getAction() {
        return action;
    }
}
