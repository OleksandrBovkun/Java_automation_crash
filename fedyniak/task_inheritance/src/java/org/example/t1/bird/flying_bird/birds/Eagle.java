package fedyniak.task_inheritance.src.java.org.example.t1.bird.flying_bird.birds;

import fedyniak.task_inheritance.src.java.org.example.t1.bird.flying_bird.FlyingBird;

public class Eagle extends FlyingBird {
    public Eagle(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Eagle fly");
    }





}
