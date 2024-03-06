package Pharma;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Medicine implements Iterator<MedicineComponent>, Comparable<Medicine> {
    private List<MedicineComponent> components;
    private int index;

    public List<MedicineComponent> getComponents() {
        return components;
    }

    public Medicine() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }


    @Override
    public boolean hasNext() {
//        return components.iterator().hasNext();
        return index < components.size();
    }

    @Override
    public MedicineComponent next() {
//        return components.iterator().next();
        return components.get(index++);
    }

    @Override
    public String toString() {
        return "Medicine: " + components.toString();
    }

    @Override
    public int compareTo(Medicine other) {
        double thisWeight = calculateTotalWeight(this.components);
        double otherWeight = calculateTotalWeight(other.components);
        return Double.compare(thisWeight, otherWeight);
    }

    private double calculateTotalWeight(List<MedicineComponent> components) {
        double totalWeight = 0;
        for (MedicineComponent component : components) {
            totalWeight += component.getWeight();
        }
        return totalWeight;
    }

    public static Comparator<Medicine> byNumberOfComponents() {
        return new Comparator<Medicine>() {
            @Override
            public int compare(Medicine m1, Medicine m2) {
                int count1 = m1.getComponents().size();
                int count2 = m2.getComponents().size();
                return Integer.compare(count1, count2);
            }
        };
    }
}
