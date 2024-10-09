package MangDoiTuong.LietKeSinhVienTheoKhoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<Students> students = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String className = sc.nextLine();
            String email = sc.nextLine();

            students.add(new Students(id, name, className, email));
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int year = sc.nextInt();
            String batch = String.valueOf(year % 100);
            System.out.println("DANH SACH SINH VIEN KHOA " + year + ":");
            for (Students student : students) {
                if (student.classStudent.substring(1, 3).equals(batch)) {
                    System.out.println(student);
                }
            }
        }
    }
}