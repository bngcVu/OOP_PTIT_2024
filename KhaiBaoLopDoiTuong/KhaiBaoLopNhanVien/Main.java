package KHAI_BAO_LOP_DOI_TUONG.KhaiBaoLopNhanVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NhanVien nhanVien = new NhanVien("00001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(nhanVien.toString());
    }
}
