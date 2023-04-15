package QuanLyNhanSu;

public class Director extends Employee{
    private double share;
    private double income;

    public Director() {
    }

    public Director(String id, String name, String phoneNumber, double dayOfWorks, double dailySalary, double share, double income) {
        super(id, name, phoneNumber, dayOfWorks, dailySalary);
        this.share = share;
        this.income = income;
    }

    public double getShare() {
        return share;
    }

    public void setShare(double share) {
        this.share = share;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public double monthlySalary() {
        return monthlySalary() * 300;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-25s%-25s%-20s%.2f%20s-20s%.2f%20s",
                getId(), getName(), getPhoneNumber(), getDayOfWorks(), getDailySalary(), monthlySalary(),share,income);
    }
}
