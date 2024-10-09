package STRING;

import java.util.Scanner;

public class J03007_soDep2 {
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

    // Kiểm tra tổng chữ so co chia het cho 10
    private static boolean checkSum(String number) {
         int sum = 0;
         for (char c : number.toCharArray()) {
             sum += c - '0';
         }
         return sum % 10 == 0;
    }


    private static boolean soDep(String number) {
        if (!thuanNghich(number)) {
            return false;
        }
        if (number.charAt(0) != '8' && number.charAt(number.length() - 1) != '8') {
            return false;
        }
        if (!checkSum(number)) {
            return false;
        }
        return true;
    }
}