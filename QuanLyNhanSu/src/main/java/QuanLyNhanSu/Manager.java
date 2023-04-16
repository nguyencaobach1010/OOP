package QuanLyNhanSu;

public class Manager extends Employee{
    private int Subordinates = 0;

    public Manager() {

    }

    public Manager(String id, String name, String phoneNumber, double dayOfWorks, double dailySalary, int subordinates) {
        super(id, name, phoneNumber, dayOfWorks, dailySalary);
        Subordinates = subordinates;
    }

    public int getSubordinates() {
        return Subordinates;
    }

    public void setSubordinates(int subordinates) {
        Subordinates = subordinates;
    }

    public double monthlySalary() {
        return super.monthlySalary() * 200 + 100 * Subordinates;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-25s%-25s%-20s%.2f%20s",
                getId(), getName(), getPhoneNumber(), getDayOfWorks(), getDailySalary(), monthlySalary(),Subordinates);
    }
}
