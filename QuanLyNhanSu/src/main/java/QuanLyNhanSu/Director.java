package QuanLyNhanSu;

import static Main.Main.scanner;

public class Director extends HumanResources{
    private double share;

    public Director() {
    }

    public Director(String id, String name, String phoneNumber, double dayOfWorks, double dailySalary, double share) {
        super(id, name, phoneNumber, dayOfWorks, dailySalary);
        this.share = share;
    }

    public double getShare() {
        return share;
    }

    public void setShare(double share) {
        this.share = share;
    }

    @Override
    public void addInfo() {
        super.addInfo();
        System.out.print("Số cổ phần: ");
        double share = scanner.nextInt();
    }

    @Override
    public double monthlySalary() {
        return monthlySalary() * 300;
    }
}
