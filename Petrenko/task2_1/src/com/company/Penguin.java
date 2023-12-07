package com.company;


class Penguin extends NonFlyingBird {
    public Penguin() {
        super(true);
    }


    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
