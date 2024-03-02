package Clients.implementation;

import Clients.Patient;
import Clients.Flyable;
import Clients.Owner;

import java.time.LocalDate;
/**
 * Класс ласточка. Ласточки умеет летать, но не умеют ходить.
 * */
public class Swallow extends Patient implements Flyable {
    public Swallow(String name, float weight, LocalDate date, Owner owner) {
        super(name, weight, date, owner);
    }

    @Override
    public void eat() {
        System.out.println(getType() + " " + getName() + " ловит насекомых.");
    }

    @Override
    public double fly(double speed) {
        return speed;
    }

    @Override
    public void toFly() {
        System.out.println(getType() + " " + getName() + " летит.");
    }
}

