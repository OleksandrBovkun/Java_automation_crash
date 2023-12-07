package com.company;

// Concrete class Eagle
class Eagle extends FlyingBird {
    public Eagle() {
        super(true);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
