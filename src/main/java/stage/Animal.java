package stage;

public abstract class Animal {

    public static void main(String[] args) {

        Cat cat = new Cat(new Spine(14), new Wool(10));
        assert (cat.getWool().getLength() == 10);
        assert (cat.getSpine().getVertebraNumber() == 14);

        Bear bear = new Bear(new Spine(12), new Wool(15));
        assert (bear.getWool().getLength() == 12);
        assert (bear.getSpine().getVertebraNumber() == 15);

        Whale whale = new Whale(new Spine(98), new Water(true));
        assert (whale.getWater().getCanBreathe() == true);
        assert (cat.getSpine().getVertebraNumber() == 98);

        Fish fish = new Fish(new Water(true));
        assert (fish.getWater().getCanBreathe() == true);

    }

}
