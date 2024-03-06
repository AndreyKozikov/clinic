import Clients.*;
import Clients.clinicstaff.Doctor;
import Clients.implementation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import Clients.VeterinaryClinic;
import Pharma.*;
import Pharma.impl.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Medicine> pharmacy = new ArrayList<>();
        Amoksicillin amoks = new Amoksicillin("Амоксициллин", 30, 23);
        Cellulose cellulose = new Cellulose("Целлюлоза", 50, 0);
        Silicon silicon = new Silicon("Кремний", 46, 0);
        Paracetamol ptamol = new Paracetamol("Парацетамол", 225, 34);
        Ivermektin iverm = new Ivermektin("Ивермектин", 12, 80);
        Starch starch = new Starch("Крахмал", 79, 0);
        Magnesium magnesium = new Magnesium("Магния стеарат", 62, 0);

        Medicine amoksicillin = new Medicine();
        amoksicillin.addComponent(amoks).addComponent(cellulose).addComponent(starch).addComponent(magnesium);
        Medicine ivermectin = new Medicine();
        ivermectin.addComponent(iverm).addComponent(starch).addComponent(cellulose);
        Medicine paracetamol = new Medicine();
        paracetamol.addComponent(ptamol).addComponent(silicon);

        pharmacy.add(amoksicillin);
        pharmacy.add(ivermectin);
        pharmacy.add(paracetamol);
        System.out.println(pharmacy);
        Collections.sort(pharmacy);
        System.out.println(pharmacy);
        pharmacy.sort(MedicineComparator.byNumberOfComponents());
        System.out.println(pharmacy);
    }
}