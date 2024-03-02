package Clients.implementation;

import Clients.Patient;
import Clients.Owner;
import Clients.Swimable;

import java.time.LocalDate;

public class Fish extends Patient implements Swimable {

    public Fish(String name, float weight, LocalDate date, Owner owner) {
        super(name, weight, date, owner);
    }

    @Override
    public void eat() {
        System.out.println(getType() + " " + getName() + " ест.");
    }

    @Override
    public double swim(double speed) {
        return 0;
    }

    @Override
    public void toSwim() {
        System.out.println(getType() + " " + getName() + " плывет.");
    }
}
