package Clients;

import java.time.LocalDate;

public class Lion extends Animal{

    public Lion(String name, float weight, LocalDate date, Owner owner) {
        super(name, weight, date, owner);
    }

    public Lion() {
        super();
    }
}
