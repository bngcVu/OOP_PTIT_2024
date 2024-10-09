package STRING;


import java.util.Scanner;
import java.util.StringTokenizer;

public class J03004_ChuanHoaHoTen_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        input.nextLine();
        while (testCases-- > 0) {
            String fullName = input.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(fullName.toLowerCase());

            while (tokenizer.hasMoreTokens()) {
                String word = tokenizer.nextToken();
                System.out.print(outputName(word) + " ");
            }
            System.out.println();
        }
    }
    private static String outputName(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}

