package KHAI_BAO_LOP_DOI_TUONG.ChuViTamGiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());

            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p3.distance(p1);

            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("INVALID");
            }
            else {
                double result = a + b + c;
                System.out.printf("%.3f\n", result);
            }
        }
    }
}
