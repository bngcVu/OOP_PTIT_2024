package KHAI_BAO_LOP_DOI_TUONG.KhaiBaoLopThiSinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ThiSinh thiSinh = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(thiSinh.toString());

    }
}
