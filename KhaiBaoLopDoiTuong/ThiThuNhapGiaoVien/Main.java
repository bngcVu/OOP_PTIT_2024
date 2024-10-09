package KHAI_BAO_LOP_DOI_TUONG.ThiThuNhapGiaoVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GiaoVien giaoVien = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextLong());

        System.out.println(giaoVien.toString());
    }
}
