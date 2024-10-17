package MangDoiTuong.LapBangTinhCong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<NhanVien> danhSachNhanVien = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String hoTen = scanner.nextLine();
            double luongCB = scanner.nextDouble();
            int ngayCong = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String cVu = scanner.nextLine();

            NhanVien nhanVien = new NhanVien("", hoTen, luongCB, ngayCong, cVu);
            danhSachNhanVien.add(nhanVien);
        }

        for (NhanVien nv : danhSachNhanVien) {
            System.out.println(nv);
        }

        scanner.close();
    }
}
