package STRING;

import java.util.Scanner;

public class J03008_soDep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTest = scanner.nextInt();
        scanner.nextLine();

        while (numTest-- > 0) {
            String number = scanner.nextLine().trim();

            if (soDep(number)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
    private static boolean soDep(String number) {
        if (!thuanNghich(number)) {
            return false;
        }

        for (char c : number.toCharArray()) {
            if (!soNguyenTo(c)) {
                return false;
            }
        }
        return true;
    }

    // Kiểm tra số thuận nghịch
    private static boolean thuanNghich(String number) {
        int left = 0;
        int right = number.length() - 1;
        while (left < right) {
            if (number.charAt(left) != number.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean soNguyenTo(char c) {
        return c == '2' || c == '3' || c == '5' || c == '7';
    }
}
