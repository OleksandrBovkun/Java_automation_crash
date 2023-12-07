package com.company;

public class Main {

    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Chicken()
        };


        for (Bird bird : birds) {
            bird.fly();
            System.out.println("Feathers: " + bird.hasFeathers());
            System.out.println("Lays Eggs: " + bird.laysEggs());
            System.out.println();
        }
    }
}
