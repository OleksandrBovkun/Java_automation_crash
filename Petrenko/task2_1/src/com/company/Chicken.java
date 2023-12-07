package com.company;

class Chicken extends NonFlyingBird {
    public Chicken() {
        super(true);
    }


    public void walk() {
        System.out.println("Chicken is walking");
    }
}
