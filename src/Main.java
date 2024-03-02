import Clients.*;
import Clients.clinicstaff.Doctor;
import Clients.implementation.*;

import java.time.LocalDate;
import Clients.VeterinaryClinic;


public class Main {
    public static void main(String[] args) {
        Dog sharik = new Dog("Дружок", 5, LocalDate.now(), new Owner());
        Dog sharik1 = new Dog("Пирожок", 15, LocalDate.now(), new Owner());
        Duck duck = new Duck("Макдак", 2, LocalDate.now(), new Owner());
        Swallow swallow = new Swallow("Птичка", 2, LocalDate.now(), new Owner());

        System.out.println(sharik.getType() + " " + sharik.getName() + " бежит со скоростью " + sharik.run(15));

        VeterinaryClinic vc = new VeterinaryClinic();
        vc.addPatient(sharik);
        vc.addPatient(sharik1);
        vc.addPatient(duck);
        vc.addPatient(swallow);
        System.out.println(vc.getAllRunners());
        System.out.println(vc.getAllFlyers());

        vc.addPersonal("Ivan", "Ivanov", 1234458255, "Moscow", 17, "Doctor");
        vc.addPersonal("Alena", "Petrova", 825534871, "Lipetsk", 7, "Nurse");
        System.out.println(vc.getDoctors());
        System.out.println(vc.getNurses());
    }

}