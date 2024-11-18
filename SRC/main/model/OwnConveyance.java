package SRC.main.model;



public class OwnConveyance extends Transport {
    private final String community;

    public OwnConveyance() {
        super("Own Conveyance", "Flexible Schedule", "Pay as you use");
        this.community = "Community Supported";
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\nCommunity: " + community;
    }
}
