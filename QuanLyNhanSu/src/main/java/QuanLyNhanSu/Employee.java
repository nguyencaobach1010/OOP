package QuanLyNhanSu;

public class Employee {
    private String id;
    private String name;
    private String phoneNumber;
    private double dayOfWorks;
    private double dailySalary;
    private Manager manager;

    public Employee() {
    }

    public Employee(String id, String name, String phoneNumber, double dayOfWorks, double dailySalary) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.dayOfWorks = dayOfWorks;
        this.dailySalary = dailySalary;
    }

    public Employee(String id, String name, String phoneNumber, double dayOfWorks, double dailySalary, Manager manager) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.dayOfWorks = dayOfWorks;
        this.dailySalary = dailySalary;
        this.manager = manager;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getDayOfWorks() {
        return dayOfWorks;
    }

    public void setDayOfWorks(double dayOfWorks) {
        this.dayOfWorks = dayOfWorks;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public double monthlySalary() {
        return dayOfWorks * dailySalary ;
    }

    public String toString() {
        return String.format("%-15s%-25s%-20s%-20s%.2f%20s",
                id, name, phoneNumber, dayOfWorks, dailySalary,monthlySalary());
    }
}
