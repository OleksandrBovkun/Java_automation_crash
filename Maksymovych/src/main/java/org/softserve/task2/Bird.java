package org.softserve.task2;

public abstract class Bird {
    protected String feathers;
    protected int layEggs;

    public abstract String fly();
}

abstract class FlyingBird extends Bird{}
abstract class NonFlyingBird extends Bird{}

final class Eagle extends FlyingBird{
    @Override
    public String fly() {
        var x = this.getClass().getName().split("\\.");
        String myName = x[x.length-1];
        return "I am " + myName + ", i can fly for a very long time";
    }
}
final class Swallow extends FlyingBird{
    @Override
    public String fly() {
        var x = this.getClass().getName().split("\\.");
        String myName = x[x.length-1];
        return "I am " + myName + ", i can fly for a long time";
    }
}
final class Penguin extends NonFlyingBird{
    @Override
    public String fly() {
        var x = this.getClass().getName().split("\\.");
        String myName = x[x.length-1];
        return "I am " + myName + ", i can not fly";
    }
}
final class Chicken extends NonFlyingBird{
    @Override
    public String fly() {
        var x = this.getClass().getName().split("\\.");
        String myName = x[x.length-1];
        return "I am " + myName + ", i barely can fly";
    }
}

class Main {
    public static void main(String[] args){
        Bird[] birds = new Bird[] {
                new Swallow(),
                new Chicken(),
                new Eagle(),
                new Penguin(),
                new Eagle(),
                new Penguin(),
                new Chicken(),
                new Swallow(),
                new Swallow()
        };
        for (var bird:birds) {
            System.out.println(bird.fly());
        }
    }
}
