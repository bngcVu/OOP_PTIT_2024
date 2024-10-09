package MangDoiTuong.LietKeSinhVienTheoLop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Students> list = new ArrayList<>();
        HashMap<String, ArrayList<Students>> sinhVien = new HashMap<>();

        while (t-- > 0){
            String id = sc.nextLine();
            if (id.isEmpty()) break;

            String name = sc.nextLine();
            String classStudent = sc.nextLine();
            String email = sc.nextLine();

            Students students = new Students(id, name, classStudent, email);
            list.add(students);

            sinhVien.computeIfAbsent(classStudent, k -> new ArrayList<>()).add(students);
        }

        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < q; i++){
            String classNeedFind = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + classNeedFind + ":");
            ArrayList<Students> sinhVienTimDuoc = sinhVien.getOrDefault(classNeedFind, new ArrayList<>());
            for (Students sv : sinhVienTimDuoc){
                System.out.println(sv);
            }
        }
        sc.close();
    }
}
