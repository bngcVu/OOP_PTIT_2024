package MangDoiTuong.SapXepDanhSachDoiTuongNhanVien;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> ds = new ArrayList<>();
        while (t-->0){
            ds.add(new NhanVien(sc));
        }
        Collections.sort(ds);
        for (NhanVien i : ds) System.out.println(i);
    }
}