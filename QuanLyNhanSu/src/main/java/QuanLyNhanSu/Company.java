package QuanLyNhanSu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String companyName;
    private String taxCode;
    private double monthlyRevenue;
    private double profit;
    private ArrayList<Employee> listOfStaff = new ArrayList<>();
    private ArrayList<Manager> listOfManager = new ArrayList<>();
    private ArrayList<Director> listOfDirector = new ArrayList<>();
    private Company company;
    private Employee employe;
    private Manager manager;
    private Director director;
    private final Scanner scanner = new Scanner(System.in);

    public Company() {

    }

    public Company(String companyName, String taxCode, double monthlyRevenue) {
        this.companyName = companyName;
        this.taxCode = taxCode;
        this.monthlyRevenue = monthlyRevenue;
    }

    public Company(String companyName, String taxCode, double monthlyRevenue, double profit, ArrayList<Employee> listOfStaff) {
        this.companyName = companyName;
        this.taxCode = taxCode;
        this.monthlyRevenue = monthlyRevenue;
        this.profit = profit;
        this.listOfStaff = listOfStaff;
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

    public double getMonthlyRevenue() {
        return monthlyRevenue;
    }

    public void setMonthlyRevenue(double monthlyRevenue) {
        this.monthlyRevenue = monthlyRevenue;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public ArrayList<Employee> getListOfStaff() {
        return listOfStaff;
    }

    public void setListOfStaff(ArrayList<Employee> listOfStaff) {
        this.listOfStaff = listOfStaff;
    }

    public ArrayList<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(ArrayList<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public ArrayList<Director> getListOfDirector() {
        return listOfDirector;
    }

    public void setListOfDirector(ArrayList<Director> listOfDirector) {
        this.listOfDirector = listOfDirector;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Employee getEmploye() {
        return employe;
    }

    public void setEmploye(Employee employe) {
        this.employe = employe;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    /**
     * Hàm thêm dữ liệu cho đỡ phải nhập :D :D
     */
    public void inputDataEmployee() {
        addDataEmployee(new Employee("NV1", "Phạm Thị Hoài Thương", "033 619 0109", 22, 100));
        addDataEmployee(new Employee("NV2", "Trần Minh Nhật", "032 653 0588", 20, 100));
        addDataEmployee(new Employee("NV3", "Đỗ Thị Diễm My", "033 579 0239", 15, 100));
        addDataEmployee(new Employee("NV4", "Lê Hoài Nam", "034 208 0802", 19, 100));
        addDataEmployee(new Employee("NV5", "Đỗ Thị Huyền Diệu", "086 972 7241", 20, 100));
        addDataEmployee(new Employee("NV6", "Nguyễn Cao Bách", "098 638 9917", 17, 100));
        addDataEmployee(new Employee("NV9", "Nguyễn Văn D", "086 934 8885", 19, 100));
        addDataEmployee(new Employee("NV7", "Nguyễn Văn C", "096 857 7965", 20, 100));
        addDataEmployee(new Employee("NV8", "Nguyễn Văn B", "086 672 0339", 21, 100));
        addDataEmployee(new Employee("NV9", "Nguyễn Văn A", "097 780 2070", 22, 100));

    }

    public void addDataEmployee(Employee employee) {
        listOfStaff.add(employee);
    }

    public void addInfoCompany() {
        System.out.println("Nhập tên công ty: ");
        String tenCongTy = scanner.nextLine();
        System.out.println("Nhập mã số thuế công ty: ");
        String maSoThue = scanner.nextLine();
        System.out.println("Nhập doanh thu tháng: ");
        double doanhThuThang = scanner.nextDouble();
        company = new Company(tenCongTy, maSoThue, doanhThuThang);
        System.out.println("Success!!!");
        printHeaderCompany();
        System.out.println(company.toString());
        printFooterCompany();
    }

    public void addStaff() {
        employe = new Employee();
        System.out.println("Mã Nhân Viên: ");
        employe.setId(scanner.nextLine());
        System.out.println("Tên Nhân Viên: ");
        employe.setName(scanner.nextLine());
        System.out.println("Số Điện Thoại: ");
        employe.setPhoneNumber(scanner.nextLine());
        System.out.println("Số Ngày Làm Việc: ");
        employe.setDayOfWorks(scanner.nextInt());
        System.out.println("Lương Ngày: ");
        employe.setDailySalary(scanner.nextDouble());
        employe.monthlySalary();
        listOfStaff.add(employe);
    }

    public void addManager() {
        manager = new Manager();
        System.out.println("Mã Trưởng Phòng: ");
        manager.setId(scanner.nextLine());
        System.out.println("Tên Trưởng Phòng: ");
        manager.setName(scanner.nextLine());
        System.out.println("Số Điện Thoại: ");
        manager.setPhoneNumber(scanner.nextLine());
        System.out.println("Số Ngày Làm Việc: ");
        manager.setDayOfWorks(scanner.nextInt());
        System.out.println("Lương Ngày: ");
        manager.setDailySalary(scanner.nextDouble());
        employe.monthlySalary();
        listOfManager.add(manager);
    }

    public void addDirector() {
        director = new Director();
        System.out.println("Mã Giám Đốc: ");
        director.setId(scanner.nextLine());
        System.out.println("Tên Giám Đốc: ");
        director.setName(scanner.nextLine());
        System.out.println("Số Điện Thoại: ");
        director.setPhoneNumber(scanner.nextLine());
        System.out.println("Số Ngày Làm Việc: ");
        director.setDayOfWorks(scanner.nextInt());
        System.out.println("Lương Ngày: ");
        director.setDailySalary(scanner.nextDouble());
        listOfDirector.add(director);
    }

    /**
     * Hàm thêm nhân viên
     */
    public void addInfoEmployee() {
        System.out.print("Nhập số lượng nhân viên: ");
        int numberOfEmployee = scanner.nextInt();
        for (int i = 0; i < numberOfEmployee; i++) {
            System.out.println("Nhập thông tin nhân viên " + (i + 1) + ":");
            System.out.println("Loại nhân viên: ");
            System.out.println("1 - Nhân viên thường");
            System.out.println("2 - Trưởng phòng");
            System.out.println("3 - Giám đốc");
            System.out.print("Nhập: ");
            int loaiNhanVien = scanner.nextInt();
            scanner.nextLine();

            switch (loaiNhanVien) {
                case 1:
                    addStaff();
                    break;
                case 2:
                    addManager();
                    break;
                case 3:
                    addDirector();
                    break;
                default:
                    System.out.println("Vui lòng chọn lại.");
                    break;
            }
        }
    }

    /**
     * Hàm tìm nhân viên theo Id
     */
    public Employee findEmployeeById(String employeeId) {
        for (Employee employee : company.getListOfStaff()) {
            if (employee instanceof Employee)
                if (employee.getId().equalsIgnoreCase(employeeId))
                    return employee;
        }
        return null;
    }

    /**
     * Hàm tìm quản lý theo Id
     */
    public Manager findManagerById(String managerId) {
        for (Manager manager : company.getListOfManager()) {
            if (manager instanceof Manager)
                if (manager.getId().equalsIgnoreCase(managerId))
                    return manager;
        }
        return null;
    }

    /**
     * Hàm chỉ định nhân viên vào quản lý
     */
    public void setEmployeeIntoManager() {
        checkInfoCompany();
        while (true) {
            printEmployee();
            System.out.println("Nhập mã Nhân Viên để thêm chức Trưởng Phòng: ");
            System.out.println("Nhập 0 thể thoát: ");
            String employeeId;
            employeeId = scanner.nextLine();
            if (employeeId.equalsIgnoreCase("0"))
                break;
            Employee employe = findEmployeeById(employeeId);
            if (employe == null) {
                System.out.println("Không tìm thấy mã nhân viên !!! ");
                continue;
            }
            System.out.println("Nhập mã số Trưởng Phòng: ");
            String managerId;
            managerId = scanner.nextLine();
            if (managerId.equalsIgnoreCase("0")) {
                employe.setManager(null);
                System.out.println("Xóa nhân viên khỏi bộ phận.");
            } else {
                Employee employeeSetToManager = findManagerById(managerId);
                if (employeeSetToManager == null) {
                    System.out.println("Không tìm thấy trưởng phòng này.");
                    continue;
                }
                employe.setManager((Manager) employeeSetToManager);
                ((Manager) employeeSetToManager).setSubordinates(((Manager) employeeSetToManager).getSubordinates() + 1);
                System.out.println("Chỉ định thành công!");
            }
        }
    }

    /**
     * Hàm thêm hoặc xóa nhân viên
     */
    public void addOrDeleteEmployee() {
        checkInfoCompany();
        int number = -1;
        System.out.println("Chọn chức năng:");
        System.out.println("1. Thêm nhân viên:");
        System.out.println("2. Xóa nhân viên:");

        number = scanner.nextInt();
        if (number == 1) {
            addInfoEmployee();
        } else {
            String employeeId;
            System.out.println("Nhập mã Nhân viên muốn xóa: ");
            employeeId = scanner.nextLine();
            for (Employee employee : listOfStaff) {
                if (employeeId.equalsIgnoreCase(employee.getId())) {
                    if (employee instanceof Manager) {
                        for (Employee staff : listOfStaff) {
                            if (staff instanceof Employee)
                                staff.setManager(null);
                        }
                    }
                    listOfStaff.remove(employee);
                }

            }
        }
    }

    /**
     * Hàm hiển thị nhân viên
     */
    public void printEmployee() {
        if (company == null) {
            System.out.println("Chưa có thông tin công ty. ");
        } else {
            printHeaderCompany();
            System.out.println(company.toString());
            printFooterCompany();
        }
        printHeader();
        for (Employee employee : listOfStaff) {
            System.out.println(employee.toString());
        }
        printFooter();
    }

    /**
     * Hàm hiển thị quản lý
     */
    public void printManager() {
        if (company == null) {
            System.out.println("Chưa có thông tin công ty. ");
        } else {
            printHeaderCompany();
            System.out.println(company.toString());
            printFooterCompany();
        }
        printHeader();
        for (Manager manager : listOfManager) {
            System.out.println(manager.toString());
        }
        printFooter();
    }

    /**
     * Hàm tính tổng thu nhập cả công ty
     */
    public void totalIncomeCompany() {
        checkInfoCompany();
        double totalSalary = 0;
        for (Employee employee : listOfStaff) {
            totalSalary += employee.monthlySalary();
        }
        System.out.println("Tổng lương toàn công ty: " + totalSalary);
        company.setProfit(company.getMonthlyRevenue() - totalSalary);
    }

    /**
     * Hàm tìm nhân viên có lương cao nhất
     */
    public void highestSalaryOfEmployee() {
        checkInfoCompany();
        double MAX = Double.MIN_VALUE;
        ArrayList<Employee> highestSalary = new ArrayList<>();
        printHeader();
        for (Employee employee : listOfStaff) {
            if (employee.monthlySalary() > MAX) {
                MAX = employee.monthlySalary();
                highestSalary.clear();
                highestSalary.add(employee);
            } else if (employee.monthlySalary() == MAX) {
                highestSalary.add(employee);
            }
        }
        System.out.println(highestSalary);
        printFooter();
    }

    /**
     * Hàm tìm quản lý có nhiều cấp dưới nhất
     */
    public void numberOfManagerHaveMostSubordinates() {
        if (company == null) {
            System.out.println("Chưa có thông tin công ty. ");
            return;
        }
        int max = 0;
        Employee employeeTemp = null;
        for (Employee employee : company.getListOfStaff()) {
            if (employee instanceof Manager)
                if (((Manager) employee).getSubordinates() > max) {
                    max = ((Manager) employee).getSubordinates();
                    employeeTemp = employee;
                }
        }
        System.out.println(employeeTemp);
    }

    /**
     * Hàm sắp xếp tên nhân viên theo ABC
     */
    public void arrangeEmployeeName() {
        checkInfoCompany();
        Collections.sort(listOfStaff, new Comparator<Employee>() {
            @Override
            public int compare(Employee employeeName, Employee employeeName2) {
                return employeeName.getName().compareTo(employeeName2.getName());
            }
        });
        System.out.println("Success!");
    }
    /**
     * Hàm hiển sắp xếp lương giảm dần
     */
    public void arrangeDecreseIncome() {
        checkInfoCompany();
        int number = listOfStaff.size();
        // Dùng vòng lặp quét các phần tử trong mảng chưa được sắp xếp
        for (int i = 0; i < number - 1; i++) {
            // Tìm phần tử nhỏ nhất trong mảng chưa sắp xếp
            int min = i;
            for (int j = i + 1; j < number; j++)
                if (listOfStaff.get(j).monthlySalary() > listOfStaff.get(min).monthlySalary())
                    min = j;
            // Hoán đổi phần tử tối thiểu tìm thấy với phần tử đầu tiên
            Employee temp = listOfStaff.get(min);
            listOfStaff.set(min, listOfStaff.get(i));
            listOfStaff.set(i, temp);
        }

        System.out.println("Success!");
    }

    /**
     * Hàm hiển thị Giám Đốc có cổ phần cao nhất
     */
    public void directorHighestShare() {
        checkInfoCompany();
        double max = 0;
        Employee temp = null;
        for (Employee employee : company.getListOfStaff()) {
            if (employee instanceof Director && ((Director) employee).getShare() > max) {
                max = ((Director) employee).getShare();
                temp = employee;
            }
        }
        System.out.println("Giám đốc có lượng cổ phần cao nhất: ");
        System.out.println(temp);

    }

    /**
     * Hàm tính tổng thu nhập của từng Giám Đốc
     */
    public void totalIncomeOfEachDirector() {
        checkInfoCompany();
        for (Employee employee : company.getListOfStaff()) {
            if (employee instanceof Director) {
                ((Director) employee).setIncome(employee.monthlySalary() + ((Director) employee).getShare() * company.getProfit());
                System.out.println(employee);
                System.out.println(((Director) employee).getShare());
            }
        }
    }

    /**
     * Hàm xử lý ngoại lệ
     * Nếu chưa có thông tin công ty thì không cho nhập
     */
    public void checkInfoCompany() {
        if (company == null) {
            System.out.println("Chưa có thông tin công ty. ");
        }
    }

    public void printHeader() {
        System.out.println("+-------------+-------------------+--------------------+----------------------+------------------+-------------------+-------------------+---------------+---------------");
        System.out.println("|     ID      |       Họ Tên      |    Số Điện Thoại   |   Số Ngày Làm Việc   |    Lương Ngày    |   Lương Tháng     |      Chức Vụ      |    Cổ Phần    |    Thu Nhập   ");
        System.out.println("+-------------+-------------------+--------------------+----------------------+------------------+-------------------+-------------------+---------------+---------------");
    }

    public void printFooter() {
        System.out.println("+-------------+-------------------+--------------------+----------------------+------------------+-------------------+-------------------+---------------+---------------");
    }

    public void printHeaderCompany() {
        System.out.println("+----------------------+----------------+----------------+---------------+");
        System.out.println("|     Tên Công Ty      |       MST      |    Doanh Thu   |   Lợi Nhuận   |");
        System.out.println("+----------------------+----------------+----------------+---------------+");
    }

    public void printFooterCompany() {
        System.out.println("+----------------------+----------------+----------------+---------------+");
    }


    @Override
    public String toString() {
        return String.format("%-25s%-15s%.2f", companyName, taxCode, monthlyRevenue);

    }
}
