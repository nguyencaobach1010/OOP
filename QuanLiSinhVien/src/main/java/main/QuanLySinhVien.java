package main;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
    private ArrayList<SinhVien> danhSachSV;

    public QuanLySinhVien() {
        danhSachSV = new ArrayList<>();
    }

    public void nhapDuLieuGia() {
        themDuLieuGia(new SinhVien("Phạm Thị Hoài Thương", "SV001", 9.0, 5.5, 1.5));
        themDuLieuGia(new SinhVien("Trần Minh Nhật", "SV002", 6.0, 7.5, 8.0));
        themDuLieuGia(new SinhVien("Đỗ Thị Diễm My", "SV003", 2.0, 3.5, 2.5));
        themDuLieuGia(new SinhVien("Lê Hoài Nam", "SV004", 10.0, 10.0, 10.0));
        themDuLieuGia(new SinhVien("Phạm Quang Sáng", "SV005", 4.25, 5.25, 6.75));
        themDuLieuGia(new SinhVien("Đỗ Thị Huyền Diệu", "SV006", 1.0, 2.5, 3.5));
        themDuLieuGia(new SinhVien("Nguyễn Cao Bách", "SV007", 8.0, 7.5, 8.5));
        themDuLieuGia(new SinhVien("Nguyễn Văn B", "SV008", 7.0, 8.0, 6.5));
        themDuLieuGia(new SinhVien("Nguyễn Văn A", "SV009", 9.0, 9.0, 9.0));
    }

    public void themDuLieuGia(SinhVien sv) {
        danhSachSV.add(sv);
    }

    public void nhapSinhVien() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sinh viên: ");
        String ten = sc.nextLine();

        System.out.print("Nhập mã sinh viên: ");
        String maSV = sc.nextLine();

        System.out.print("Nhập điểm Toán: ");
        double diemToan = sc.nextDouble();

        System.out.print("Nhập điểm Lý: ");
        double diemLy = sc.nextDouble();

        System.out.print("Nhập điểm Hóa: ");
        double diemHoa = sc.nextDouble();

        danhSachSV.add(new SinhVien(ten, maSV, diemToan, diemLy, diemHoa));
        SinhVien sv = new SinhVien();
        System.out.println("Điểm Trung Bình: " + sv.tinhDiemTB(diemToan, diemLy, diemHoa));
    }

    public void printAllStudents() {
        printHeader();
        for (SinhVien student : danhSachSV) {
            System.out.println(student.toString());
        }
        printFooter();
    }

    public void printHighestAverage() {
        double maxAverage = Double.MIN_VALUE;
        ArrayList<SinhVien> highestStudents = new ArrayList<>();
        printHeader();
        for (SinhVien student : danhSachSV) {
            if (student.tinhDiemTB(student.getDiemToan(), student.getDiemLy(), student.getDiemHoa()) > maxAverage) {
                maxAverage = student.tinhDiemTB(student.getDiemToan(), student.getDiemLy(), student.getDiemHoa());
                highestStudents.clear();
                highestStudents.add(student);
            } else if (student.tinhDiemTB(student.getDiemToan(), student.getDiemLy(), student.getDiemHoa()) == maxAverage) {
                highestStudents.add(student);
            }
        }
        System.out.println(highestStudents);
        printFooter();
    }

    public void printLowestAverage() {
        printHeader();
        for (SinhVien sv : danhSachSV) {
            if (sv.xepLoai().equals("Yếu")) {
                System.out.println(sv);
            }
        }
        printFooter();
    }

    public void findNameByName(String ten) {
        printHeader();
        for (SinhVien sv : danhSachSV) {
            if (sv.getTen().toLowerCase().contains(ten.toLowerCase())) {
                System.out.println(sv.toString());
            }
        }
        printFooter();
    }

    public void findNameById(String Id) {
        printHeader();
        for (SinhVien sv : danhSachSV) {
            if (sv.getMaSV().toLowerCase().contains(Id.toLowerCase())) {
                System.out.println(sv.toString());
            }
        }
        printFooter();
    }

    public void deleteById(String Id) {
        for (SinhVien sv : danhSachSV) {
            if (sv.getMaSV().toLowerCase().contains(Id.toLowerCase())) {
                danhSachSV.remove(sv);
                break;
            }
        }
    }

    public void printHeader() {
        System.out.println("+-----------------+----------------+-----------+--------+-----------+----------+-----------------+");
        System.out.println("|      Họ Tên     |  Mã Sinh Viên  |    Toán   |   Lý   |    Hóa    |    TB    |     Xếp Loại    |");
        System.out.println("+-----------------+----------------+-----------+--------+-----------+----------+-----------------+");
    }

    public void printFooter() {
        System.out.println("+-----------------+----------------+-----------+--------+-----------+----------+-----------------+");
    }
}
