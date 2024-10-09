package MangDoiTuong.DanhSachGiangVienTheoBoMon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<Teacher> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String subject = sc.nextLine();

            ds.add(new Teacher(name, subject));
        }

        int q = Integer.parseInt(sc.nextLine());
        while (q--> 0) {
            String query = sc.nextLine();
            String abbreviatedSubject = getAbbreviationQuery(query);

            for (Teacher subjectFind : ds) {
                if (subjectFind.)
            }


        }

    }

    private static String getAbbreviationQuery(String subject) {
        StringBuilder sb = new StringBuilder();
        for (String part : subject.split(" ")) {
            sb.append(Character.toUpperCase(part.charAt(0)));
        }
        return sb.toString();
    }
}
