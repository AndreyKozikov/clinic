package Clients.implementation;

import Clients.Goable;
import Clients.Owner;
import Clients.Patient;

import java.time.LocalDate;

public class Lion extends Patient implements Goable {

    public Lion(String name, float weight, LocalDate date, Owner owner) {
        super(name, weight, date, owner);
    }

    @Override
    public void eat() {
        System.out.println(getType() + " " + getName() + " рвет добычу.");
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
