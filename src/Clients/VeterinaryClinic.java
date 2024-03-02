package Clients;

import Clients.clinicstaff.Doctor;
import Clients.clinicstaff.Nurse;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Patient> patients;
    private List<Doctor> doctors;
    private List<Nurse> nurses;

    public VeterinaryClinic() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        nurses = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Goable> getAllRunners() {
        List<Goable> runners = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient instanceof Goable) {
                runners.add((Goable) patient);
            }
        }
        return runners;
    }

    public List<Swimable> getAllSwimmers() {
        List<Swimable> swimmers = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient instanceof Swimable) {
                swimmers.add((Swimable) patient);
            }
        }
        return swimmers;
    }

    public List<Flyable> getAllFlyers() {
        List<Flyable> flyers = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient instanceof Flyable) {
                flyers.add((Flyable) patient);
            }
        }
        return flyers;
    }

    public void addPersonal(String firstName, String lastName, int passport, String address, int years, String position) {
        if (position.equals("Doctor")) {
        Doctor dc = new Doctor(firstName, lastName, passport, address, years, "Doctor");
        doctors.add(dc);
        } else if (position.equals("Nurse")) {
            Nurse ns = new Nurse(firstName, lastName, passport, address, years, "Nurse");
            nurses.add(ns);
        }
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }
}
