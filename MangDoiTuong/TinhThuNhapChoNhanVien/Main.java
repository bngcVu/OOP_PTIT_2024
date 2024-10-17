package MangDoiTuong.TinhThuNhapChoNhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line

        ArrayList<NhanVien> danhSachNV = new ArrayList<>();

        while (t-- > 0) {
            String hoTen = scanner.nextLine();
            String chucVu = scanner.nextLine();
            double luongCB = scanner.nextDouble();
            int soNgayCong = scanner.nextInt();
            scanner.nextLine();

            danhSachNV.add(new NhanVien(hoTen, chucVu, luongCB, soNgayCong));
        }


        for (NhanVien nv : danhSachNV) {
            System.out.println(nv);
        }

        scanner.close();
    }
}
