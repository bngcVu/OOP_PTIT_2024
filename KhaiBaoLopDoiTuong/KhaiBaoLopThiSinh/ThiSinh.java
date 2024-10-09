package KHAI_BAO_LOP_DOI_TUONG.KhaiBaoLopThiSinh;

public class ThiSinh {
    private String name;
    private String birth;
    private float point1;
    private float point2;
    private float point3;
    private float pointSum;

    public ThiSinh(String name, String birth, float point1, float point2, float point3) {
        this.name = name;
        this.birth = birth;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.pointSum = point1 + point2 + point3;
    }

    public float getPointSum() {
        return pointSum;
    }

    @Override
    public String toString() {
        return name + " " + birth + " " + String.format("%.1f", pointSum);
    }
}
