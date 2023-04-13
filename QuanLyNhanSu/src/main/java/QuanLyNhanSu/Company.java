package QuanLyNhanSu;

import java.util.ArrayList;
import java.util.Scanner;

import static Main.Main.scanner;

public class Company {
    private String companyName;
    private String taxCode;
    private String monthlyRevenue;
    private ArrayList<Employee> listOfEmployees;
    private ArrayList<Manager> listOfManagers;
    private ArrayList<Director> listOfDirectors;

    public Company() {
        listOfEmployees = new ArrayList<>();
        listOfManagers = new ArrayList<>();
        listOfDirectors = new ArrayList<>();
    }

    public Company(String companyName, String taxCode, String monthlyRevenue, ArrayList<Employee> employees, ArrayList<Manager> managers, ArrayList<Director> directors) {
        this.companyName = companyName;
        this.taxCode = taxCode;
        this.monthlyRevenue = monthlyRevenue;
        this.listOfEmployees = employees;
        this.listOfManagers = managers;
        this.listOfDirectors = directors;
    }

    public void addEmployee(Employee employee) {
        listOfEmployees.add(employee);
    }

    public void addManager(Manager manager) {
        listOfManagers.add(manager);
    }

    public void addDirector(Director director) {
        listOfDirectors.add(director);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getMonthlyRevenue() {
        return monthlyRevenue;
    }

    public void setMonthlyRevenue(String monthlyRevenue) {
        this.monthlyRevenue = monthlyRevenue;
    }
//    public void removeEmployee(Employee employee) {
//        employees.remove(employee);
//        if (employee.getManager() != null) {
//            employee.getManager().removeEmployee(employee);
//        }
//    }

//    public void removeManager(Manager manager) {
//        for (Employee employee : manager.getEmployees()) {
//            employee.setManager(null);
//        }
//        managers.remove(manager);
//    }

//    public void removeDirector(Director director) {
//        directors.remove(director);
//    }

    //    public void printAllEmployees() {
//        System.out.println("\nEmployees:");
//        System.out.printf("%-5s %-20s %-15s %-10s %-10s %-15s\n", "ID", "Name", "Phone", "Days", "Salary", "Manager");
//        for (Employee employee : employees) {
//            System.out.printf("%-5s %-20s %-15s %-10d %-10.2f ", employee.getId(), employee.getName(), employee.getPhone(),
//                    employee.getDaysWorked(), employee.calculateSalary());
//            if (employee.getManager() != null) {
//                System.out.printf("%-15s\n", employee.getManager().getName());
//            } else {
//                System.out.println("");
//            }
//        }
//        System.out.println("\nManagers:");
//        System.out.printf("%-5s %-20s %-15s %-10s %-10s %-20s\n", "ID", "Name", "Phone", "Days", "Salary", "Num of Employees");
//        for (Manager manager : managers) {
//            System.out.printf("%-5s %-20s %-15s %-10d %-10.2f %-20d\n", manager.getId(), manager.getName(), manager.getPhone(),
//                    manager.getDaysWorked(), manager.calculateSalary(), manager.getEmployees().size());
//        }
//        System.out.println("\nDirectors:");
//        System.out.printf("%-5s %-20s %-15s %-10s %-10s %-20s\n", "ID", "Name", "Phone", "Days", "Salary", "Shares");
//        for (Director director : directors) {
//            System.out.printf("%-5s %-20s %-15s %-10d %-10.2f %-20d%%\n", director.getId(), director.getName(), director.getPhone(),
//                    director.getDaysWorked(), director.calculateSalary(), director.getShares());
//        }
//    }
    public void addInfoEmployee() {
        System.out.print("Nhập số lượng nhân viên: ");
        int numberOfEmployee  = scanner.nextInt();
        for (int i = 0; i < numberOfEmployee; i++) {
            System.out.println("Nhập thông tin nhân viên " + (i + 1) + ":");
            System.out.println("Loại nhân viên: ");
            System.out.println("1 - Nhân viên thường");
            System.out.println("2 - Trưởng phòng");
            System.out.println("3 - Giám đốc");
            System.out.print("Nhập: ");
            int loaiNhanVien = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line

            switch (loaiNhanVien) {
                case 1:
                    Employee employee = new Employee();
                    employee.addInfo();
                    listOfEmployees.add(employee);
                    break;
                case 2:
                    Manager manager = new Manager();
                    manager.addInfo();
                    listOfManagers.add(manager);
                    break;
                case 3:
                    Director director = new Director();
                    director.addInfo();
                    listOfDirectors.add(director);
                    break;
                default:
                    System.out.println("Loại nhân viên không hợp lệ!");
                    break;
            }
        }
        System.out.println("Nhập thông tin công ty thành công!");
    }
    public void addInfoCompany(){
        Company company = new Company();
        System.out.println("Tên Công Ty: ");
        String nameCompany = scanner.nextLine();
        System.out.println("Mã Số Thuế: ");
        String codeTax = scanner.nextLine();
        System.out.println("Doanh Thu Tháng: ");
        String monthRevenue = scanner.nextLine();
        company.setCompanyName(nameCompany);
        company.setTaxCode(codeTax);
        company.setMonthlyRevenue(monthRevenue);
    }
}
