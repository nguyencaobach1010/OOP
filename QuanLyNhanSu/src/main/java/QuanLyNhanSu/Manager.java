package QuanLyNhanSu;

import java.util.ArrayList;

public class Manager extends HumanResources{
    private int Subordinates;

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

    @Override
    public double monthlySalary() {
        return monthlySalary() * 200 * Subordinates;
    }

    @Override
    public void addInfo() {
        super.addInfo();
    }

    public void increaseSubordinates() {
        Subordinates++;
        monthlySalary();
    }

}
