package Main;

import QuanLyNhanSu.Company;

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
            System.out.println("|   12. Thêm dữ liệu nhân viên giả                                                               |");
            System.out.println("|   13. Thêm dữ liệu công ty giả                                                                 |");
            System.out.println("|   00. Thoát                                                                                    |");
            System.out.println("==================================================================================================");
            System.out.print("Chức năng số: ");
            Choice = scanner.nextInt();
            scanner.nextLine();
            switch (Choice) {
                case 1:
                    System.out.println("Nhập thông tin công ty");
                    company.addInfoCompany();
                    break;
                case 2:
                    System.out.println("Phân bổ Nhân viên vào Trưởng phòng");
                    company.setEmployeeIntoManager();
                    break;
                case 3:
                    System.out.println("Thêm, xóa thông tin một nhân sự");
                    company.addOrDeleteEmployee();
                    break;
                case 4:
                    System.out.println("Xuất ra thông tin toàn bộ người trong công ty");
//                    company.displayInfoOfEmployee();
                    company.printEmployee();
                    company.printManager();
                    break;
                case 5:
                    System.out.println("Tính và xuất tổng lương cho toàn công ty");
                    company.totalIncomeCompany();
                    break;
                case 6:
                    System.out.println("Tìm Nhân viên thường có lương cao nhất");
                    company.highestSalaryOfEmployee();
                    break;
                case 7:
                    System.out.println("Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất");
                    company.numberOfManagerHaveMostSubordinates();
                    break;
                case 8:
                    System.out.println("Sắp xếp nhân viên toàn công ty theo thứ tự abc");
                    company.arrangeEmployeeName();
                    break;
                case 9:
                    System.out.println("Sắp xếp nhân viên công ty theo thứ tự lương giảm dần");
                    company.arrangeDecreseIncome();
                    break;
                case 10:
                    System.out.println("Tìm Giám Đốc có số lượng cổ phần nhiều nhất");
                    company.directorHighestShare();
                    break;
                case 11:
                    System.out.println("Tính và Xuất tổng THU NHẬP của từng Giám Đốc");
                    company.totalIncomeOfEachDirector();
                    break;
                case 12:
                    System.out.println("Thêm dữ liệu nhân viên");
                    company.inputDataEmployee();
                    break;
                case 0:
                    System.out.println("Tạm biệt!!!");
                    System.exit(0);
                    break;
            }
        } while (Choice != 0);
    }

}