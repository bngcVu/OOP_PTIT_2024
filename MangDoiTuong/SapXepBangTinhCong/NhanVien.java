package MangDoiTuong.SapXepBangTinhCong;

public class NhanVien implements Comparable<NhanVien>{
    private static int dem = 1;
    private String maNV, hoTen, chucVu;
    private int soNgayCong;
    private double luongCoBan;


    public NhanVien(String maNV, String hoTen, double luongCoBan, int soNgayCong, String chucVu) {
        this.maNV = String.format("NV%02d", dem++);
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
    }

    public double tienLuong() {
        return luongCoBan * soNgayCong;
    }

    public double tienThuong() {
        double luong = tienLuong();
        if (soNgayCong >= 25) {
            return 0.2 * luong;
        } else if (soNgayCong >= 22) {
            return 0.1 * luong;
        }
        return 0;
    }

    public double phuCap() {
        switch (chucVu) {
            case "GD": return 250000;
            case "PGD": return 200000;
            case "TP": return 180000;
            case "NV": return 150000;
            default: return 0;
        }
    }

    public double thuNhap() {
        return tienLuong() + tienThuong() + phuCap();
    }

    @Override
    public int compareTo(NhanVien p) {
        return Double.compare(p.thuNhap(), this.thuNhap());
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f %.0f %.0f",
                maNV, hoTen, tienLuong(), tienThuong(), phuCap(), thuNhap());
    }
}
