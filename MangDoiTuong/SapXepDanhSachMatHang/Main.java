package MangDoiTuong.SapXepDanhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MatHang> ds = new ArrayList<>();
        while(t-->0){
            sc.nextLine();
            ds.add(new MatHang(sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble()));
        }
        Collections.sort(ds);
        for(MatHang tmp : ds){
            System.out.print(tmp);
            System.out.printf("%.2f\n",tmp.profit);
        }
    }
}
