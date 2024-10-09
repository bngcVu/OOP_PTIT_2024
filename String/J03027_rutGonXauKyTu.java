package STRING;

import java.util.Scanner;
import java.util.Stack;

public class J03027_rutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st  = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (st.isEmpty()) {
                st.push(str.charAt(i));
                continue;
            }
            char tmp = st.peek(); // Gọi phần tử trên đỉnh Stack
            if (str.charAt(i) != tmp) st.push(str.charAt(i));
            else {
                st.pop();
            }
        }
        if (st.isEmpty()) System.out.println("Empty String");
        else {
            for (char i : st) System.out.print(i);
        }
    }
}
