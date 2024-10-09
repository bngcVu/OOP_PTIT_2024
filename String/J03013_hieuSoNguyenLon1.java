package STRING;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013_hieuSoNguyenLon1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s_1 = sc.next();
            String s_2 = sc.next();
            BigInteger num_1 = new BigInteger(s_1);
            BigInteger num_2 = new BigInteger(s_2);
            BigInteger res = num_1.subtract(num_2).abs();
            String ans = res.toString();
            if(ans.length() < Math.max(s_1.length(), s_2.length())){
                ans = '0' + ans;
            }
            System.out.println(ans);
        }
    }
}
