package Clients;
import java.time.LocalDate;

public class Animal {
    protected String name;
    protected float weight;
    protected LocalDate date;
    protected Owner owner;

    public Animal(String name, float weight, LocalDate date, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.date = date;
        this.owner = owner;
    }
    public Animal() {
        this("testAnimal", 34, LocalDate.now(), new Owner());
    }

    private void sleep(){
        System.out.println(getType() + " sleep...");
    }

    private void wakeUp(){
        System.out.println(getType() + " wakeup");
    }

    private void wakeUp(int time){
        System.out.println(getType() + " wakeup in " + time);
    }

    private void eat(){
        System.out.println(getType() + " eat");
    }

    private void play(){
        System.out.println(getType() + " play");
    }

    public void toGo(){
        System.out.println(getType() + " go");
    }

    public void fly(){
        System.out.println(getType() + " fly");
    }

    public void swim(){
        System.out.println(getType() + " swim");
    }

    public void live(){
        wakeUp();
        eat();
        play();
        sleep();
    }
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
