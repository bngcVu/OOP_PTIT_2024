package STRING;

import java.math.BigInteger;
import java.util.Scanner;

public class J03014_TongSoNguyenLon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = 1;
        while (t-- > 0) {
            String a = sc.nextLine();
            String b = sc.nextLine();

            System.out.println(operation(a, b));
        }
        sc.close();
    }
    private static String operation (String a, String b) {
        BigInteger x = new BigInteger(a);
        BigInteger y = new BigInteger(b);

        BigInteger z = x.add(y);

        String result = z.toString();
        return result;
    }
}
