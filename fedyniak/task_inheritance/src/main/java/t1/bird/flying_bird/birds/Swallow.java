package t1.bird.flying_bird.birds;



public class Swallow extends FlyingBird {
    public Swallow(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Swallow fly");
    }
}
