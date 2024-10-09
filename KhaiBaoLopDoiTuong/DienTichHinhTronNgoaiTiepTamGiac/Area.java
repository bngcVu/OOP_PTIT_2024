package KHAI_BAO_LOP_DOI_TUONG.DienTichHinhTronNgoaiTiepTamGiac;

public class Area {
    public double canh1, canh2, canh3;

    public Area(Point a, Point b, Point c) {
        this.canh1 = a.distance(b);
        this.canh2 = b.distance(c);
        this.canh3 = c.distance(a);
    }

    public boolean check() {
        double m = this.canh1;
        double n = this.canh2;
        double p = this.canh3;
        return m + n > p && n + p > m && p + m > n;
    }
    // chu vi
    public double findPerimeter() {
        return this.canh1 + this.canh2 + this.canh3;
    }
    // dien tich tam giac
    public double findArea() {
        double a = this.canh1;
        double b = this.canh2;
        double c = this.canh3;
        return Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c)) / 4;

    }
    // dien tich hinh tron
    public double findCircleArea() {
        double S = this.findArea();
        double a = this.canh1;
        double b = this.canh2;
        double c = this.canh3;
        double R = (a * b * c) / (4 * S);
        return Math.PI * Math.pow(R, 2);
    }
}
