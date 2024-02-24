package Clients;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(String name, float weight, LocalDate date, Owner owner) {
        super(name, weight, date, owner);
    }
}
