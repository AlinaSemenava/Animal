package stage;

public class Cat extends Mammal {

    private final Wool wool;

    public Cat(Spine spine, Wool wool) {
        super(spine);

        this.wool = wool;
    }

    public Wool getWool() {
        return wool;
    }
}
