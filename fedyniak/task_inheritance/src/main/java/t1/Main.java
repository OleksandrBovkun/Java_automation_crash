package t1;



import t1.bird.Bird;
import t1.bird.flying_bird.birds.Eagle;
import t1.bird.flying_bird.birds.Swallow;
import t1.bird.non_flying_bird.Chicken;
import t1.bird.non_flying_bird.Penguin;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(new Penguin("1","1"));
        birds.add(new Eagle("2","2"));
        birds.add(new Chicken("3","3"));
        birds.add(new Swallow("4","4"));


        for(Bird bird: birds){
            System.out.println(bird);
            bird.fly();
        }

    }
}


