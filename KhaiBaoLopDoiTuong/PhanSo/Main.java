package KHAI_BAO_LOP_DOI_TUONG.PhanSo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo x = new PhanSo(sc.nextLong(), sc.nextLong());
        System.out.println(x.toString());

    }
}
