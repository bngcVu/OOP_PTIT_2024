package KHAI_BAO_LOP_DOI_TUONG.DienTichTamGiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTestCases = scanner.nextInt();

        for (int i = 0; i < numTestCases; i++) {
            Point p1 = new Point(scanner.nextDouble(), scanner.nextDouble());
            Point p2 = new Point(scanner.nextDouble(), scanner.nextDouble());
            Point p3 = new Point(scanner.nextDouble(), scanner.nextDouble());

            double sideA = Point.distance(p1, p2);
            double sideB = Point.distance(p2, p3);
            double sideC = Point.distance(p1, p3);

            // Validate triangle inequality (corrected error)
            if (!isValidTriangle(sideA, sideB, sideC)) {
                System.out.println("INVALID");
                continue; // Skip to next test case
            }

            double area = Point.heron(sideA, sideB, sideC);
            System.out.printf("%.2f\n", area);
        }
    }

    // Function to check if three sides can form a valid triangle
    public static boolean isValidTriangle(double sideA, double sideB, double sideC) {
        return (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);
    }
}
