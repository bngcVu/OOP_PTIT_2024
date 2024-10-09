package KHAI_BAO_LOP_DOI_TUONG.LopTriangle1;

class Triangle{
    public double canh1,canh2,canh3;

    Triangle(Point a, Point b, Point c) {
        this.canh1 = a.distance(b);
        this.canh2 = b.distance(c);
        this.canh3 = c.distance(a);
    }

    boolean valid(){
        double m = this.canh1;
        double n = this.canh2;
        double p = this.canh3;
        return m+n>p && n+p>m && p+m>n;
    }

    double getPerimeter(){
        return (double) Math.round((this.canh1 + this.canh2 + this.canh3)*1000)/1000;
    }
}