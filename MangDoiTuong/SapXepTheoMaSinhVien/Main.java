package MangDoiTuong.SapXepTheoMaSinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Students> danhSachSinhVien = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String ma = scanner.nextLine();
            if (ma.isEmpty()) break;  // Dừng nếu gặp dòng trống

            String hoTen = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();

            Students sv= new Students(ma, hoTen, lop, email);
            danhSachSinhVien.add(sv);
        }

        Collections.sort(danhSachSinhVien);

        for (Students sv : danhSachSinhVien) {
            System.out.println(sv);
        }

        scanner.close();
    }
}
