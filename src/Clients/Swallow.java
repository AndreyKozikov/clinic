package Clients;

import java.time.LocalDate;
/**
 * Класс ласточка. Ласточки умеет летать, но не умеют ходить.
 * */
public class Swallow extends Animal {
    public Swallow(String name, float weight, LocalDate date, Owner owner) {
        super(name, weight, date, owner);
    }

    public Swallow() {
    }
}
