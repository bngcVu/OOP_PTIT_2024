package MangDoiTuong.DanhSachDoanhNghiepNhanSinhVienThucTap_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        ArrayList<DoanhNghiep> ds = new ArrayList<>();

        int t = sc.nextInt();

        while (t-- > 0) {
            sc.nextLine();
            ds.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        Collections.sort(ds);
        for (DoanhNghiep tmp : ds) System.out.println(tmp);
    }
}
