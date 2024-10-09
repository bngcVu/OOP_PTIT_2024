package MangDoiTuong.DanhSachDoiTuongSinhVien3;

import java.util.Scanner;

public class SinhVien implements Comparable<SinhVien> {
    private String msv, ten, ngaySinh, lop;
    private float gpa;
    private static int stt = 1;

    public SinhVien() {
        this.msv = "B20DCCN" + String.format("%03d", stt++);
        this.ten = "";
        this.lop = "";
        this.ngaySinh = "";
        this.gpa = 0.0f;
    }

    private String chuanHoaTen(String s) {
        s = s.trim().toLowerCase();
        String[] parts = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            sb.append(Character.toUpperCase(part.charAt(0)))
                    .append(part.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    private String chuanHoaNgaySinh(String ngaySinh) {
        String[] parts = ngaySinh.split("/");
        String d = String.format("%02d", Integer.parseInt(parts[0]));
        String m = String.format("%02d", Integer.parseInt(parts[1]));
        String y = parts[2];
        return d + "/" + m + "/" + y;
    }

    public SinhVien(Scanner sc) {
        this();
        this.ten = chuanHoaTen(sc.nextLine());
        this.lop = sc.nextLine();
        this.ngaySinh = chuanHoaNgaySinh(sc.nextLine());
        this.gpa = sc.nextFloat();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }

    @Override
    public int compareTo(SinhVien other) {
        if (this.gpa < other.gpa) return 1; // Sắp xếp theo GPA giảm dần
        if (this.gpa > other.gpa) return -1;
        return 0; // Nếu bằng nhau
    }
}
