package stage;

public class Whale extends Mammal {
    private final Water water;

    public Whale(Spine spine, Water water) {
        super(spine);

        this.water = water;
    }

    public Water getWater() {
        return water;
    }
}
