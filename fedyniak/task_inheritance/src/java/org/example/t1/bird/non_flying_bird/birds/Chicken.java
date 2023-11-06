package fedyniak.task_inheritance.src.java.org.example.t1.bird.non_flying_bird.birds;

import fedyniak.task_inheritance.src.java.org.example.t1.bird.non_flying_bird.NonFlyingBird;

public class Chicken extends NonFlyingBird {


    public Chicken(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Chicken don't fly");
    }
}
