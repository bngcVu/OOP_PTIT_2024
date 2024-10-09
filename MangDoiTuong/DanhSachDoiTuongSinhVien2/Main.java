package MangDoiTuong.DanhSachDoiTuongSinhVien2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            ds.add(new SinhVien(sc));
        }
        for(SinhVien i : ds) System.out.println(i);
    }
}
