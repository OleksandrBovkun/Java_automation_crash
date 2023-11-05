package org.example;

public class FlyingBird extends Bird {
    public FlyingBird(boolean feathers) {
        super(feathers, true);
    }

    @Override
    public void fly() {
        System.out.println("This flying bird is soaring through the sky.");
    }
}
