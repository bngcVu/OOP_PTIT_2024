package STRING;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J03021_DienThoaiCucGach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            if (checkStr(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean checkStr(String s) {
        String res = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if(x == 'a'||x == 'b'||x == 'c')
                res += '2';
            if(x == 'd'||x == 'e'||x == 'f')
                res += '3';
            if(x == 'g'||x == 'h'||x == 'i')
                res += '4';
            if(x == 'j'||x == 'k'||x == 'l')
                res += '5';
            if(x == 'm'||x == 'n'||x == 'o')
                res += '6';
            if(x == 'p'||x == 'q'||x == 'r'||x == 's')
                res += '7';
            if(x == 't'||x == 'u'||x == 'v')
                res += '8';
            if(x == 'w'||x == 'x'||x == 'y'||x == 'z')
                res += '9';
        }

        for (int i = 0; i < res.length() / 2; i++) {
            if (res.charAt(i) != res.charAt(res.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}