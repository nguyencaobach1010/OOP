package main;

public class SinhVien {
    private String ten;
    private String maSV;
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    public SinhVien() {
    }
    public SinhVien(String ten, String maSV, double diemToan, double diemLy, double diemHoa) {
        this.ten = ten;
        this.maSV = maSV;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getTen() {
        return ten;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public double tinhDiemTB(double diemToan, double diemLy, double diemHoa) {
        return (diemToan + diemLy + diemHoa) / 3.0;
    }

    public String xepLoai() {
        double diemTB = tinhDiemTB(diemToan, diemLy, diemHoa);
        if (diemTB >= 9.0) {
            return "Xuất sắc";
        } else if (diemTB > 8.0) {
            return "Giỏi";
        } else if (diemTB > 7.0) {
            return "Khá";
        } else if (diemTB > 6.0) {
            return "Trung bình khá";
        } else if (diemTB > 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    public String toString() {
        return String.format("%-25s%-15s%.2f%10.2f%10.2f%10.2f%20s",
                ten, maSV, diemToan, diemLy, diemHoa, tinhDiemTB(diemToan,diemLy,diemHoa), xepLoai());
    }
}