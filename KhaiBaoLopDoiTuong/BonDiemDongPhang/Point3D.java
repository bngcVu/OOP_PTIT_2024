package KHAI_BAO_LOP_DOI_TUONG.BonDiemDongPhang;

class Point3D{
    public int  x,y,z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    static boolean check(Point3D p1,Point3D p2,Point3D p3,Point3D p4){
        int a1 = p1.x - p2.x;
        int a2 = p1.y - p2.y;
        int a3 = p1.z - p2.z;

        int b1 = p3.x - p2.x;
        int b2 = p3.y - p2.y;
        int b3 = p3.z - p2.z;

        int c1 = p3.x - p4.x;
        int c2 = p3.y - p4.y;
        int c3 = p3.z - p4.z;

        int d1 = a2*b3 - a3*b2;
        int d2 = a3*b1 - a1*b3;
        int d3 = a1*b2 - a2*b1;
        return c1*d1 + c2*d2 + c3*d3 == 0;
    }
}
