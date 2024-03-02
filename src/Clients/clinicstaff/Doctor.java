package Clients.clinicstaff;

import Clients.Medication.Medication;
import Clients.Patient;

public class Doctor extends personal{
    public Doctor(String firstName, String lastName, int passportSeries, String homeAddress, int yearsOfService, String position) {
        super(firstName, lastName, passportSeries, homeAddress, yearsOfService, position);
    }

    public void diagnosePatient(Patient patient) {
        // Логика диагностики пациента
    }
    public void healing(Patient patient) {
        // Логика лечения пациента
    }
    public void prescribeMedication(Patient patient, Medication medication) {
        // Логика назначения лекарств пациенту
    }
}
