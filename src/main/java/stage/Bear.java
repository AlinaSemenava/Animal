package stage;

public class Bear extends Mammal {

    private final Wool wool;

    public Bear(Spine spine, Wool wool) {
        super(spine);

        this.wool = wool;
    }

    public Wool getWool() {
        return wool;
    }
}
