package KHAI_BAO_LOP_DOI_TUONG.DienTichTamGiac;

public class Point {
    private double x, y;
    // Tạo đối tượng mặc định
    public Point() {
        x = y = 0;
    }
    // Tạo đối tượng có tọa độ tham số
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Trả về tọa độ Y
    public double getX() {
        return x;
    }
    // Trả về tọa độ Y
    public double getY() {
        return y;
    }
    //Tại đối tượng là bản sao của đối tượng
    public Point(Point p) {
        x = p.getX();
        y = p.getY();
    }
    // Khoảng cách từ điểm này tới điểm thứ 2
    public double distance(Point secondPoint) {
        return Math.sqrt(Math.pow(x - secondPoint.getX(), 2) + Math.pow(y - secondPoint.getY(), 2));
    }
    // Khoảng cách giữa 2 điểm
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    public static double heron(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p -c));
    }

    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }
}