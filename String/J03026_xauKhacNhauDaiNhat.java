package STRING;

import java.util.*;

public class J03026_xauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String a = sc.nextLine();
            String b = sc.nextLine();

            if (a.compareTo(b) == 0) System.out.println("-1");
            else System.out.println(Math.max(a.length(), b.length()));
        }
    }
}
