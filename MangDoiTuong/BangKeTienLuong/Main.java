package MangDoiTuong.BangKeTienLuong;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<NhanVien> ds = new ArrayList<>();
        long tongChiPhi = 0;

        for (int i = 0; i < n; i++) {
            NhanVien nv = new NhanVien(sc);
            ds.add(nv);
            tongChiPhi += nv.getThucLinh();
        }

        for (NhanVien nv : ds) {
            System.out.println(nv);
        }

        System.out.println("Tong chi phi tien luong: " + tongChiPhi);
    }
}
