package STRING;

import java.math.BigInteger;
import java.util.Scanner;

public class J03015_HieuSoNguyenLon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        BigInteger c = new BigInteger(a);
        BigInteger d = new BigInteger(b);

        BigInteger temp = c.subtract(d);

        String ans = temp.toString();

        System.out.println(ans);
    }
}
