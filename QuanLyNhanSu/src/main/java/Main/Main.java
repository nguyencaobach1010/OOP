package Main;

import QuanLyNhanSu.Company;
import QuanLyNhanSu.Manager;

import java.util.Scanner;

public class Main {
    public static int Choice;
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Company company = new Company();
        do {
            System.out.println("==============================================MENU================================================");
            System.out.println("|                                   VUI LÒNG CHỌN CHỨC NĂNG:                                     |");
            System.out.println("==================================================================================================");
            System.out.println("|   01. Nhập thông tin công ty.                                                                  |");
            System.out.println("|   02. Phân bổ Nhân viên vào Trưởng phòng.                                                      |");
            System.out.println("|   03. Thêm, xóa thông tin một nhân sự (có thể là Nhân viên, trưởng phòng hoặc giám đốc).       |\n"
                    + "|" + "       Lưu ý khi xóa trưởng phòng, phải ngắt liên kết với các nhân viên đang tham chiếu tớ      |");
            System.out.println("|   04. Xuất ra thông tin toàn bộ người trong công ty                                            |");
            System.out.println("|   05. Tính và xuất tổng lương cho toàn công ty.                                                |");
            System.out.println("|   06. Tìm Nhân viên thường có lương cao nhất.                                                  |");
            System.out.println("|   07. Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất.                            |");
            System.out.println("|   08. Sắp xếp nhân viên toàn công ty theo thứ tự abc.                                          |");
            System.out.println("|   09. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần.                               |");
            System.out.println("|   10. Tìm Giám Đốc có số lượng cổ phần nhiều nhất.                                             |");
            System.out.println("|   11. Tính và Xuất tổng THU NHẬP của từng Giám Đốc                                             |");
            System.out.println("|   00. Thoát                                                                                    |");
            System.out.println("==================================================================================================");
            System.out.print("Chức năng số: ");
            Choice = scanner.nextInt();
            scanner.nextLine();
            switch (Choice) {
                case 1:
                    System.out.println("=============Nhập thông tin công ty ============");
                    System.out.println("Tên Công Ty: ");
                    String nameCompany = scanner.nextLine();
                    System.out.println("Mã Số Thuế: ");
                    String codeTax = scanner.nextLine();
                    System.out.println("Doanh Thu Tháng: ");
                    String monthRevenue = scanner.nextLine();
                    company.setCompanyName(nameCompany);
                    company.setTaxCode(codeTax);
                    company.setMonthlyRevenue(monthRevenue);
                    break;
                case 2:
                    System.out.println("=============Phân bổ Nhân viên vào Trưởng phòng============");
                    System.out.println("Nhập mã số nhân viên");
                    String employeeCode = scanner.nextLine();
//                    Manager manager = company.findManagerById(employeeCode);
//                    Employee nhanVien = Company.timNhanVienTheoMaSo(employeeCode);
//                    if (nhanVien == null) {
//                        System.out.println("Không tìm thấy nhân viên có mã số là " + employeeCode);
//                    } else if (!(nhanVien instanceof Staff)) {
//                        System.out.println("Nhân viên này không phải là Nhân viên thường!");
                    break;
                case 3:
                    System.out.println("=============Thêm, xóa thông tin một nhân sự================");
                    break;
                case 4:
                    System.out.println("=============Xuất ra thông tin toàn bộ người trong công ty================");
                    break;
                case 5:
                    System.out.println("=============Tính và xuất tổng lương cho toàn công ty================");

                    break;
                case 6:
                    System.out.println("=============Tìm Nhân viên thường có lương cao nhất================");


                    break;
                case 7:
                    System.out.println("=============Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất================");

                    break;
                case 8:
                    System.out.println("===============Sắp xếp nhân viên toàn công ty theo thứ tự abc===============");

                    break;
                case 9:
                    System.out.println("===============Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần===============");

                    break;
                case 10:
                    System.out.println("===============Tìm Giám Đốc có số lượng cổ phần nhiều nhất===============");

                    break;
                case 11:
                    System.out.println("===============Tính và Xuất tổng THU NHẬP của từng Giám Đốc===============");

                    break;
                case 0:
                    System.out.println("======================Tạm biệt!======================");
                    System.exit(0);
                    break;
            }
        } while (Choice != 0);
    }
}
