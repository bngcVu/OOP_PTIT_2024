package KHAI_BAO_LOP_DOI_TUONG.BaiToanTinhCong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien x = new NhanVien(sc.nextLine(), sc.nextLong(), sc.nextLong(), sc.next());
        System.out.println(x.toString());
    }
}
