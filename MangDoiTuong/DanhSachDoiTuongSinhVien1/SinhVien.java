package MangDoiTuong.DanhSachDoiTuongSinhVien1;

import java.util.Scanner;

public class SinhVien {
    private String msv, ten, ngaySinh, lop;
    private float gpa;
    private static int stt = 1;

    public SinhVien() {
        this.msv = "B20DCCN" + String.format("%03d", stt++);
        this.ten = "";
        this.ngaySinh = "";
        this.lop = "";
        this.gpa = 0.0f;
    }

    // Chuan hoa ngay sinh
    private String chuanHoa(String ngaySinh) {
        String[] parts = ngaySinh.split("/");
        String d = String.format("%02d", Integer.parseInt(parts[0]));
        String m = String.format("%02d", Integer.parseInt(parts[1]));
        String y = parts[2];
        return d + "/" + m + "/" + y;
    }

    // Nhap tt
    public SinhVien(Scanner sc) {
        this(); // Gọi hàm khởi tạo không tham số
        this.ten = sc.nextLine();
        this.lop = sc.nextLine();
        this.ngaySinh = chuanHoa(sc.nextLine());
        this.gpa = sc.nextFloat();
        sc.nextLine(); // Đọc dòng mới
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }
}
