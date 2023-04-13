package QuanLyNhanSu;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private String taxCode;
    private String monthlyRevenue;

    private ArrayList<Employee> listOfEmployee;
    public Company() {
    }

    public Company(String companyName, String taxCode, String monthlyRevenue, ArrayList<Employee> listOfEmployee) {
        this.companyName = companyName;
        this.taxCode = taxCode;
        this.monthlyRevenue = monthlyRevenue;
        this.listOfEmployee = listOfEmployee;
    }

    public void manageEmployee() {
        listOfEmployee = new ArrayList<>();
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

    public ArrayList<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void setListOfEmployee(ArrayList<Employee> listOfEmployee) {
        this.listOfEmployee = listOfEmployee;
    }

//    public void addEmployee(Employee employee) {
//        employee.add(employee);
//        if (employee instanceof Manager) {
//            Manager manager = (Manager) employee;
//            if (manager.getSupervisor() != null) {
//                manager.getSupervisor().setNumOfEmployees(manager.getSupervisor().getNumOfEmployees() + 1);
//            }
//        }
//    }
}
