import Clients.*;

import java.time.LocalDate;

import java.time.LocalDate;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Lion leva = new Lion("leva", 45, LocalDate.now(), new Owner());
        Dog sharik = new Dog("Pesel", 5, LocalDate.now(), new Owner());
        Fish goldFish = new Fish("Gold Fish", 1, LocalDate.now(), new Owner());
        Swallow swallow1 = new Swallow("Top Gun", 1, LocalDate.now(), new Owner());
        Duck mackDuck = new Duck("Mac Duck", 10, LocalDate.now(), new Owner());

        System.out.println(leva);
        leva.live();
        leva.toGo();

        System.out.println(sharik);
        sharik.live();
        sharik.toGo();

        System.out.println(goldFish);
        goldFish.swim();

        System.out.println(swallow1);
        swallow1.fly();

        System.out.println(mackDuck);
        mackDuck.toGo();
        mackDuck.swim();
        mackDuck.fly();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(leva);
        animals.add(sharik);
        animals.add(goldFish);
        animals.add(mackDuck);
        animals.add(swallow1);
        System.out.println(animals);
    }

}