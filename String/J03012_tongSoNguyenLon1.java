package STRING;

import java.math.BigInteger;
import java.util.Scanner;

public class J03012_tongSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTest = scanner.nextInt();
        scanner.nextLine(); // Bỏ qua ký tự xuống dòng

        while (numTest-- > 0) {
            String X = scanner.nextLine().trim();
            String Y = scanner.nextLine().trim();

            System.out.println(operation(X, Y));
        }
        scanner.close();
    }

    private static String operation(String X, String Y) {
        // Chuyển đổi chuỗi thành BigInteger
        BigInteger a = new BigInteger(X);
        BigInteger b = new BigInteger(Y);

        // Tính tổng
        BigInteger sum = a.add(b);

        // Chuyển tổng thành chuỗi
        String result = sum.toString();

        // Đảm bảo độ dài của kết quả bằng độ dài của số lớn hơn
        int maxLength = Math.max(X.length(), Y.length());
        while (result.length() < maxLength) {
            result = "0" + result; // Thêm số 0 vào đầu chuỗi
        }

        return result;
    }
}
