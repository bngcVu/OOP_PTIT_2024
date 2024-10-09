package STRING;

import java.util.*;

public class J0309_tapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng

        while (t-- > 0) {
            String[] s1 = scanner.nextLine().split("\\s+");
            String s2 = scanner.nextLine();

            HashSet<String> word = new HashSet<>();

            for (String i : s1) {
                if (!s2.contains(i)) {
                    word.add(i);
                }
            }

            for (String str : word) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
