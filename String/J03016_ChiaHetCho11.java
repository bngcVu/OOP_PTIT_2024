package STRING;

import java.util.Scanner;

public class J03016_ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String n = sc.nextLine();
            int tongChan = 0, tongLe = 0;
            for (int i = 0; i < n.length(); i++) {
                int digit = n.charAt(i) - '0';
                if (i % 2 == 0) {
                    tongChan += digit;
                } else {
                    tongLe += digit;
                }
            }
            int hieu = Math.abs(tongChan - tongLe);
            System.out.println(hieu % 11 == 0 ? 1 : 0);
        }
    }
}
