package Clients.implementation;

import Clients.*;

import java.time.LocalDate;

public class Duck extends Patient implements Goable, Flyable, Swimable {

    public Duck(String name, float weight, LocalDate date, Owner owner) {
        super(name, weight, date, owner);
    }

    @Override
    public void eat() {
        System.out.println(getType() + " " + getName() + " клюет.");
    }

    @Override
    public double run(double speed) {
        return speed;
    }
    @Override
    public double fly(double speed) {
        return speed;
    }
    @Override
    public void toGo() {
        System.out.println(getType() + " " + getName() + " идет, неуклюже переваливаясь.");
    }

    @Override
    public void toFly() {
        System.out.println(getType() + " " + getName() + " летит.");
    }

    @Override
    public double swim(double speed) {
        return speed;
    }

    @Override
    public void toSwim() {
        System.out.println(getType() + " " + getName() + " плавает.");
    }
}