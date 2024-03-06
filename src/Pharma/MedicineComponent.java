package Pharma;

public abstract class MedicineComponent implements Comparable<MedicineComponent> {
    private String name;
    private float weight;
    private int power;

    public MedicineComponent(String name, float weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public int compareTo(MedicineComponent o) {
        return power - o.power;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                '}';
    }
}
