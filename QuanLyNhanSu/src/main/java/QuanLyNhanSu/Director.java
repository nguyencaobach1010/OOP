package QuanLyNhanSu;

public class Director extends Employee{
    private double shareholdingPercentage;

    public Director(String id, String name, String phoneNumber, double daysOfWork, double dailySalary, Employee supervisor, double shareholdingPercentage) {
        super(id, name, phoneNumber, daysOfWork, dailySalary, supervisor);
        this.shareholdingPercentage = shareholdingPercentage;
    }

    @Override
    public double calculateSalary() {
        return calculateSalary()* 300;
    }
}
