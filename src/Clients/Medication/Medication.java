package Clients.Medication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Medication {
    private String name;
    private List<String> components;

    public Medication(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(String component) {
        components.add(component);
    }

    public void removeComponent(String component) {
        components.remove(component);
    }

    public String getName() {
        return name;
    }

    public List<String> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "Medication: " + name + ", Components: " + components;
    }
}
