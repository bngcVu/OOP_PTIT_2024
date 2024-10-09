package KHAI_BAO_LOP_DOI_TUONG.BaiToanTuyenSinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        x.inThongTin();
    }
}
