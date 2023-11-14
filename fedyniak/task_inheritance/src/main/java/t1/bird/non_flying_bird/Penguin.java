package t1.bird.non_flying_bird;




public class Penguin extends NonFlyingBird {

    public Penguin(String feathers, String layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void fly() {
        System.out.println("Penguin don't fly");
    }
}
