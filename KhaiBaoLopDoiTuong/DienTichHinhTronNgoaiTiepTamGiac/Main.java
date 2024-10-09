package KHAI_BAO_LOP_DOI_TUONG.DienTichHinhTronNgoaiTiepTamGiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());

            Area triangle = new Area(p1, p2, p3);
            if (triangle.check()) System.out.printf("%.3f\n", triangle.findCircleArea());
            else System.out.println("INVALID");
        }
    }
}