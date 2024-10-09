package STRING;

import java.util.Scanner;

public class J03022_XuLyVanBan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String[] parts = line.split("[.?!]");

            for (String part : parts) {
                if (!part.trim().isEmpty()) {
                    String result = part.trim().toLowerCase();
                    result = Character.toUpperCase(result.charAt(0)) + result.substring(1);
                    System.out.println(result);
                }
            }
        }
    }
}
