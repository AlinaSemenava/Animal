package stage;

public class Fish extends Animal {
    private final Water water;

    public Fish(Water water) {
        this.water = water;
    }

    public Water getWater() {
        return water;
    }
}
