package MangDoiTuong.DanhSachDoiTuongSinhVien3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> ds = new ArrayList<>();
        while (t-- >0){
            ds.add(new SinhVien(sc));
        }
        Collections.sort(ds);
        for(SinhVien i : ds) System.out.println(i);
    }
}
