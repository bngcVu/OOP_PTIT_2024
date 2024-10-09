package MangDoiTuong.SapXepMatHang;

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
            ds.add(new MatHang(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(ds);

        for(MatHang tmp : ds) {
            System.out.println(tmp);
        }
    }
}
