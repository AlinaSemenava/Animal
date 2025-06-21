package stage;

public abstract class Mammal extends Animal {

    private Spine spine;

    public Mammal(Spine spine) {
        this.spine = spine;
    }

    public Spine getSpine() {
        return spine;
    }
}
