package MangDoiTuong.SoPhuc;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            SoPhuc a = new SoPhuc(sc.nextInt(),sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(),sc.nextInt());
            SoPhuc e = a.add(b);
            System.out.print(e.mul(a));
            System.out.print(", ");
            System.out.println(e.mul(e));
        }
    }
}
