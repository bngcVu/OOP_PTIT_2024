package STRING;

import java.util.HashSet;
import java.util.Scanner;

public class J03038_danhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        HashSet<Character> str = new HashSet<>();

        // Đọc từng ký tự trong xâu để lưu vào Set
        for (char c : s.toCharArray()) {
            str.add(c);
        }

        System.out.println(str.size());

    }
}
