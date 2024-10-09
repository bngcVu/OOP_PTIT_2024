package KHAI_BAO_LOP_DOI_TUONG.TongPhanSo;

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tu1 = sc.nextInt(), mau1 = sc.nextInt();
        int tu2 = sc.nextInt(), mau2 = sc.nextInt();

        PhanSo p = new PhanSo(tu1, mau1);
        PhanSo q = new PhanSo(tu2, mau2);
        PhanSo kq = new PhanSo();
        kq = PhanSo.cong(p, q);
        System.out.println(kq.toString());

    }
}
