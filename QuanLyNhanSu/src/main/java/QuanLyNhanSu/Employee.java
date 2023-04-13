package QuanLyNhanSu;

import static Main.Main.scanner;

public class Employee extends HumanResources{
    private Manager manager;

    public Employee() {
    }
    public Employee(String id, String name, String phoneNumber, double dayOfWorks, double dailySalary, Manager manager) {
        super(id, name, phoneNumber, dayOfWorks, dailySalary);
        this.manager = manager;
    }



    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public double monthlySalary() {
        return monthlySalary() * 100;
    }

    @Override
    public void addInfo() {
        super.addInfo();
    }
}
