package org.example;

public class Main {
    public static void main(String[] args) {

        Bird[] birds = new Bird[4];
        birds[0] = new Eagle(true);
        birds[1] = new Swallow(true);
        birds[2] = new Penguin(false);
        birds[3] = new Chicken(true);

        for (Bird bird : birds) {
            System.out.println("Bird has feathers: " + bird.hasFeathers());
            System.out.println("Bird can lay eggs: " + bird.canLayEggs());
            bird.fly();
            System.out.println();
        }
    }
}

