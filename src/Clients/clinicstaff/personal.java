package Clients.clinicstaff;

public abstract class personal { //Класс для объединения всего персонала клиники: директор, доктор, медсестра, "стюардесса" на входе, бухгалтер,  и др.
    private String firstName;
    private String lastName;
    private int passportSeries;
    private String homeAddress;
    private int yearsOfService; //стаж работы

    public personal(String firstName, String lastName, int passportSeries, String homeAddress, int yearsOfService, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportSeries = passportSeries;
        this.homeAddress = homeAddress;
        this.yearsOfService = yearsOfService;
        this.position = position;
    }

    private String position; // должность

    public int getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(int passportSeries) {
        this.passportSeries = passportSeries;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getPosition() {
        return position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String name) {
        this.lastName = lastName;
    }
    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

@Override
public String toString() {
        return String.format("Фамилия = %s, Имя = %s, Паспорт = %s, Домашний адрес = %s, Стаж работы = %s", firstName, lastName, passportSeries, homeAddress, yearsOfService);
    }

}
