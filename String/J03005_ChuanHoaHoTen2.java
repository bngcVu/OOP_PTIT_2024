package STRING;

import java.util.Scanner;

public class J03005_ChuanHoaHoTen2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNames = scanner.nextInt();
        scanner.nextLine(); // Bỏ qua ký tự xuống dòng

        for (int i = 0; i < numNames; i++) {
            String name = scanner.nextLine();

            String chuanHoaHoTen = chuanHoa(name);
            System.out.println(chuanHoaHoTen);
        }

        scanner.close();
    }

    private static String chuanHoa(String name) {
        String[] parts = name.trim().split("\\s+");

        StringBuilder chuanHoaHoTen = new StringBuilder();

        String firstPart = parts[0].toUpperCase();

        for (int i = 1; i < parts.length; i++) {
            String part = parts[i];
            // Viet hoa chu cai dau tien
            part = part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase();
            chuanHoaHoTen.append(part).append(" ");
        }

        // Loại bỏ phàn trắng thừa ở cuối và nối phần họ
        String result = chuanHoaHoTen.toString().trim();
        result += ", " + firstPart;

        return result;


    }
}
