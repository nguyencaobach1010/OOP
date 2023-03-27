package Test;

import main.QuanLySinhVien;
import main.SinhVien;

import java.util.Scanner;

public class Test {
    public static int Choice;
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        QuanLySinhVien dssv = new QuanLySinhVien();

        do {
            System.out.println("=======================MENU=========================");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println("====================================================");
            System.out.println("|   1. Nhập dữ liệu giả.                           |");
            System.out.println("|   2. Tính điểm TB từng sinh viên.                |");
            System.out.println("|   3. Xếp loại từng sinh viên. In ra danh sách    |");
            System.out.println("|   4. In ra SV có ĐTB cao nhất. In ra danh sách   |");
            System.out.println("|   5. In ra tất cả sinh viên Yếu. In ra danh sách.|");
            System.out.println("|   6. Tìm sinh viên theo tên. In ra danh sách.    |");
            System.out.println("|   7. Tìm sinh viên theo mã.  In ra danh sách     |");
            System.out.println("|   8. Xóa 1 sinh viên theo mã.                    |");
            System.out.println("|   0. Thoát                                       |");
            System.out.println("====================================================");
            System.out.print("Chức năng số: ");
            Choice = scanner.nextInt();
            scanner.nextLine();
            switch (Choice) {
                case 1:
                    System.out.println("=============Nhập dữ liệu ============");
                    System.out.println("Thành Công!");
                    dssv.nhapDuLieuGia();
                    break;
                case 2:
                    System.out.println("=============Tính điểm TB từng sinh viên============");
                    dssv.nhapSinhVien();
                    break;
                case 3:
                    System.out.println("=============Xếp loại từng sinh viên================");
                    dssv.printAllStudents();
                    break;
                case 4:
                    System.out.println("=============Sinh viên có ĐTB cao nhất================");
                    dssv.printHighestAverage();
                    break;
                case 5:
                    System.out.println("=============Sinh viên có ĐTB thấp nhất================");
                    dssv.printLowestAverage();
                    break;
                case 6:
                    System.out.println("=============Tìm sinh viên theo tên================");
                    System.out.println("Nhập tên sinh viên: ");
                    String tenSV = scanner.nextLine();
                    dssv.findNameByName(tenSV);

                    break;
                case 7:
                    System.out.println("=============Tìm sinh viên theo mã================");
                    System.out.println("Nhập mã sinh viên: ");
                    String maSV = scanner.nextLine();
                    dssv.findNameById(maSV);
                    break;
                case 8:
                    System.out.println("===============Xóa 1 sinh viên theo mã===============");
                    System.out.println("Nhập ID cần xóa: ");
                    String xoaId = scanner.nextLine();
                    dssv.deleteById(xoaId);
                    System.out.println("Xóa Thành Công");
                    break;
                case 0:
                    System.out.println("======================Tạm biệt!======================");
                    System.exit(0);
                    break;
            }
        } while (Choice != 0);
    }
}
