package MangDoiTuong.DanhSachDoiTuongSinhVien1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine(); // Đọc dòng mới

        ArrayList<SinhVien> ds = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            ds.add(new SinhVien(sc));
        }

        for (SinhVien sv : ds) {
            System.out.println(sv);
        }

        sc.close();
    }
}

