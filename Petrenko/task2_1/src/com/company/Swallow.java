package com.company;


class Swallow extends FlyingBird {
    public Swallow() {
        super(true);
    }

    @Override
    public void fly() {
        System.out.println("Swallow is flying");
    }
}
