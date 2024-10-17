package MangDoiTuong.BangXepHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        ArrayList<SinhVien> ds = new ArrayList<>();

        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String[] thongTin = sc.nextLine().split(" ");
            int soBaiDung = Integer.parseInt(thongTin[0]);
            long soLuotLam = Long.parseLong(thongTin[1]);

            ds.add(new SinhVien(hoTen, soBaiDung, soLuotLam));
        }

        Collections.sort(ds);

        for (SinhVien sinhVien : ds) {
            System.out.println(sinhVien);
        }
        sc.close();
    }
}
