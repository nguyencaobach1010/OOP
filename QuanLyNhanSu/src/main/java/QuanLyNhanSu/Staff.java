package QuanLyNhanSu;

public class Staff extends Employee{
    private Manager manager;

    public Staff(String id, String name, String phoneNumber, double daysOfWork, double dailySalary, Employee supervisor, Manager manager) {
        super(id, name, phoneNumber, daysOfWork, dailySalary, supervisor);
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public double calculateSalary() {
        return calculateSalary() * 100;
    }
}
