package Clients;

import java.time.LocalDate;

public class Fish extends Animal{

    public Fish(String name, float weight, LocalDate date, Owner owner) {
        super(name, weight, date, owner);
    }
    public Fish() {
    }
}
