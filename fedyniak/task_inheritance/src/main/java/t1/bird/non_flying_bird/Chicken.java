package t1.bird.non_flying_bird;



public class Chicken extends NonFlyingBird {


    public Chicken(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Chicken don't fly");
    }
}
