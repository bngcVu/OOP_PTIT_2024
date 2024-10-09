package STRING;

import java.util.Scanner;

public class J03025_xauDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String S = sc.nextLine().trim();
            if (comparatorString(S)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    private static boolean comparatorString(String S) {
        int mismathChar = 0;
        for (int i = 0; i < S.length() / 2; i++) {
            if (S.charAt(i) != S.charAt(S.length() - i - 1)) {
                mismathChar++;
            }
        }
        if (mismathChar == 1 || (S.length() % 2 == 1 && mismathChar == 0)) return true;
        else return false;
    }
}
