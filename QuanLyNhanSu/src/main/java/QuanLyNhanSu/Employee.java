package QuanLyNhanSu;

public class Employee {
    private String Id;
    private String name;
    private String phoneNumber;
    private double daysOfWork;
    private double dailySalary;
    private Employee supervisor;

    public Employee() {
    }

    public Employee(String id, String name, String phoneNumber, double daysOfWork, double dailySalary, Employee supervisor) {
        Id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.daysOfWork = daysOfWork;
        this.dailySalary = dailySalary;
        this.supervisor = supervisor;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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

    public double getDaysOfWork() {
        return daysOfWork;
    }

    public void setDaysOfWork(double daysOfWork) {
        this.daysOfWork = daysOfWork;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public double calculateSalary() {
        return daysOfWork * dailySalary * 100;
    }

    public String toString() {
        return "ID: " + this.Id + ", Họ tên: " + this.name + ", Số điện thoại: " + this.phoneNumber + ", Lương tháng: " + this.calculateSalary();
    }


}
