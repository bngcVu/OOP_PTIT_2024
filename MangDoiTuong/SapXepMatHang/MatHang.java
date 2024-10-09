package MangDoiTuong.SapXepMatHang;

public class MatHang implements Comparable<MatHang> {
    private static int counter = 1;
    private String maMatHang;
    private String tenMatHang;
    private String donViTinh;
    private int giaMua;
    private int giaBan;

    public MatHang(String ten, String donVi, int mua, int ban) {
        this.maMatHang = String.format("MH%03d", counter++);
        this.tenMatHang = ten;
        this.donViTinh = donVi;
        this.giaMua = mua;
        this.giaBan = ban;
    }

    public int profit() {
        return giaBan - giaMua;
    }

    @Override
    public int compareTo(MatHang other) {
        int profitDiff = other.profit() - this.profit();
        if (profitDiff == 0) {
            return this.maMatHang.compareTo(other.maMatHang);
        }
        return profitDiff;
    }

    @Override
    public String toString() {
        return maMatHang + " " + tenMatHang + " " + donViTinh + " " + giaMua + " " + giaBan + " " + profit();
    }
}
