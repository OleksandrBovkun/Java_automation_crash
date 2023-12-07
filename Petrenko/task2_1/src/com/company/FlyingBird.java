package com.company;

class FlyingBird extends Bird {
    public FlyingBird(boolean feathers) {
        super(feathers, true);
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}