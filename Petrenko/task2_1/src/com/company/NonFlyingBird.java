package com.company;

class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers) {
        super(feathers, true);
    }

    @Override
    public void fly() {
        System.out.println("Non-flying");
    }
}
