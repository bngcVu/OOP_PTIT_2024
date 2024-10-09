package KHAI_BAO_LOP_DOI_TUONG.KhaiBaoLopSinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien x = new SinhVien("B20DCCN001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        x.chuanHoa();
        System.out.println(x.toString());
    }
}
