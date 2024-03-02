package Clients.clinicstaff;

import Clients.Patient;

public class Nurse extends personal {

    public Nurse(String firstName, String lastName, int passportSeries, String homeAddress, int yearsOfService, String position) {
        super(firstName, lastName, passportSeries, homeAddress, yearsOfService, position);
    }

    public void assistDoctor(Doctor doctor) {
        // Логика помощи врачу
    }
    public void providePatientCare(Patient patient) {
        // Логика ухода за пациентом
    }

    public void giveInjection(Patient patient){
        //Логика постановки укола
    }
}
