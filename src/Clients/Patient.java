package Clients;
import java.time.LocalDate;

public abstract class Patient {
    protected String name;
    protected float weight;
    protected LocalDate date;
    protected Owner owner;

    public Patient(String name, float weight, LocalDate date, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.date = date;
        this.owner = owner;
    }

    public abstract void eat();

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public LocalDate getDate() {
        return date;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getType(){
        return getClass().getSimpleName();
    }
    @Override
    public String toString() {
        return String.format("Name=%s, Weight=%s, Age=%s, Owner=%s", name, weight, date, owner);
    }
}
