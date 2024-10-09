package MangDoiTuong.SapXepDanhSachGiangVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> ds = new ArrayList<>();
        int t = sc.nextInt(); sc.nextLine();
        while(t-->0){
            ds.add(new Teacher(sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ds);
        for(Teacher tmp : ds) System.out.println(tmp);
    }
}
