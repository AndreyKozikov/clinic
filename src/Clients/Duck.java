package Clients;

import java.time.LocalDate;

public class Duck extends Animal{

    public Duck() {
    }

    public Duck(String name, float weight, LocalDate date, Owner owner) {
        super(name, weight, date, owner);
    }
}
