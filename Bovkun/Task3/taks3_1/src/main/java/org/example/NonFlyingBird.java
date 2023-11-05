package org.example;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers) {
        super(feathers, true);
    }

    @Override
    public void fly() {
        System.out.println("This non-flying bird can't fly.");
    }
}
