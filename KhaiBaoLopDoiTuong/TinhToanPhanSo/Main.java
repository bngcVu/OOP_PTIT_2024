package KHAI_BAO_LOP_DOI_TUONG.TinhToanPhanSo;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Fraction a = new Fraction(sc.nextLong(),sc.nextLong());
            Fraction b = new Fraction(sc.nextLong(),sc.nextLong());
            Fraction c = a.add(b);
            c = c.mul(c);
            Fraction d = a.mul(b).mul(c);
            System.out.print(c);
            System.out.println(d);
        }
    }
}
