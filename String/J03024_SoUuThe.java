package STRING;

import java.util.Scanner;

public class J03024_SoUuThe {
    static boolean kiemTra(String number) {
        for (char c : number.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return !number.startsWith("0");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String number = sc.next();

            if (!kiemTra(number)) {
                System.out.println("INVALID");
                continue;
            }

            int oddCount = 0, evenCount = 0;
            for (char c : number.toCharArray()) {
                int digit = c - '0';
                if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            if (evenCount > oddCount && number.length() % 2 == 0 || oddCount > evenCount && number.length() % 2 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
