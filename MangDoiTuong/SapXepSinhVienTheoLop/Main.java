package MangDoiTuong.SapXepSinhVienTheoLop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Students> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String classStudent = sc.nextLine();
            String email = sc.nextLine();

            Students students = new Students(msv, name, classStudent, email);
            list.add(students);
        }

        Collections.sort(list);

        for (Students student : list){
            System.out.println(student);
        }
        sc.close();
    }
}
