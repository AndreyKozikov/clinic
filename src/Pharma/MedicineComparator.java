package Pharma;

import java.util.Comparator;

public class MedicineComparator {

    // Компаратор для сортировки по количеству компонентов
    public static Comparator<Medicine> byNumberOfComponents() {
        return new Comparator<Medicine>() {
            @Override
            public int compare(Medicine medicine1, Medicine medicine2) {
                return Integer.compare(medicine1.getComponents().size(), medicine2.getComponents().size());
            }
        };
    }
}
