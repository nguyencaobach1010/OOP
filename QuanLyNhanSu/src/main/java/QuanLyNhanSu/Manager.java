package QuanLyNhanSu;

public class Manager extends Employee{
    private int numberOfSubordinates;

    public Manager(String id, String name, String phoneNumber, double daysOfWork, double dailySalary, Employee supervisor, int numberOfSubordinates) {
        super(id, name, phoneNumber, daysOfWork, dailySalary, supervisor);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public void addSubordinate() {
        numberOfSubordinates++;
    }

    @Override
    public double calculateSalary() {
        return calculateSalary() * 200 * numberOfSubordinates;
    }
}
