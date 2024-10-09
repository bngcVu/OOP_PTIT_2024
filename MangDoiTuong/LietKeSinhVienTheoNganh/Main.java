package MangDoiTuong.LietKeSinhVienTheoNganh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<Students> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String className = sc.nextLine();
            String email = sc.nextLine();

            students.add(new Students(id, name, className, email));
        }

        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < q; i++) {
            String word = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + word.toUpperCase() + ":");
            for (Students student : students) {
                String major = "";
                if(student.id.contains("DCKT")) major = "Ke toan";
                else if (student.id.contains("DCCN") && !student.className.startsWith("E")) major = "Cong nghe thong tin";
                else if (student.id.contains("DCAT") && !student.className.startsWith("E")) major = "An toan thong tin";
                else if (student.id.contains("DCVT")) major = "Vien thong";
                else if (student.id.contains("DCDT")) major = "Dien tu";

                if (major.equals(word)) {
                    System.out.println(student);
                }
            }
        }

    }
}
