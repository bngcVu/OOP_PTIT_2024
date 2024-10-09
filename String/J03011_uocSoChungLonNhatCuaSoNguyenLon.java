package STRING;

import java.math.BigInteger;
import java.util.Scanner;

public class J03011_uocSoChungLonNhatCuaSoNguyenLon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            BigInteger a = new BigInteger(in.next());
            BigInteger b = new BigInteger(in.next());

            BigInteger result = a.gcd(b);
            System.out.println(result);
        }
    }
}
