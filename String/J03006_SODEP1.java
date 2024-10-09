package STRING;

import java.util.Scanner;

public class J03006_SODEP1 {
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

    // Kiểm tra ký tự có phải số chẵn hay không
    private static boolean soChan(char c) {
        return c == '0' || c == '2' || c == '4' || c == '6' || c == '8';
    }

    private static boolean soDep(String number) {
        if (!thuanNghich(number)) {
            return false;
        }
        for (char c : number.toCharArray()) {
            if (!soChan(c)) {
                return false;
            }
        }
        return true;
    }
}