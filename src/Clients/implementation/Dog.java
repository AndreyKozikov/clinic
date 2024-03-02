package Clients.implementation;

import Clients.Patient;
import Clients.Goable;
import Clients.Owner;

import java.time.LocalDate;

public class Dog extends Patient implements Goable {
    public Dog(String name, float weight, LocalDate date, Owner owner) {
        super(name, weight, date, owner);
    }

    @Override
    public void eat() {
        System.out.println(getType() + " " + getName() + " ест.");
    }

    @Override
    public double run(double speed) {
        return speed;
    }

    @Override
    public void toGo() {
        System.out.println(getType() + " " + getName() + " бежит.");
    }
}
