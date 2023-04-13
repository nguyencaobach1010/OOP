package QuanLyNhanSu;

import static Main.Main.scanner;

abstract class HumanResources {
    private String id;
    private String name;
    private String phoneNumber;
    private double dayOfWorks;

    private double dailySalary;

    public HumanResources() {
    }

    public HumanResources(String id, String name, String phoneNumber, double dayOfWorks, double dailySalary) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.dayOfWorks = dayOfWorks;
        this.dailySalary = dailySalary;
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

    public double monthlySalary() {
        return dayOfWorks * dailySalary;
    }

    public String toString() {
        return String.format("%-25s%-15s%.2f%10.2f%10.2f%10.2f%20s",
                id, name, phoneNumber, dayOfWorks, dailySalary, monthlySalary());
    }
    public void addInfo(){
        System.out.print("Nhập mã số: ");
        String id_employee = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        String name_employee = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phone_number = scanner.nextLine();
        System.out.print("Nhập số ngày làm việc: ");
        double day_of_works = scanner.nextInt();
        System.out.print("Nhập lương ngày: ");
        double daily_salary = scanner.nextInt();
        scanner.nextLine();
//        Employee staff = new Employee(id_employee, name_employee, phone_number, day_of_works);
//        danhSachNhanVien.add(staff);
    }
}
