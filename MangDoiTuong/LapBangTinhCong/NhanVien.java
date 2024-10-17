package MangDoiTuong.LapBangTinhCong;

public class NhanVien {
    private static int dem = 1;
    private String maNV;
    private String hoTen;
    private double luongCB;
    private int ngayCong;
    private String cVu;


    public NhanVien(String mnv, String hoTen, double luongCB, int ngayCong, String cVu) {
        this.maNV = String.format("NV%02d", dem++);
        this.hoTen = hoTen;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
        this.cVu = cVu;
    }

    public double tinhLuong() {
        return luongCB * ngayCong;
    }

    public double tinhThuong() {
        double luong = tinhLuong();
        if (ngayCong >= 25) {
            return 0.2 * luong;
        } else if (ngayCong >= 22) {
            return 0.1 * luong;
        }
        return 0;
    }

    public double tinhPhuCap() {
        switch (cVu) {
            case "GD": return 250000;
            case  "PGD": return 200000;
            case  "TP": return 180000;
            case "NV": return 150000;
            default: return 0;
        }
    }

    public double tinhThuNhap() {
        return tinhLuong() + tinhThuong() + tinhPhuCap();
    }


    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f %.0f %.0f",
                maNV, hoTen, tinhLuong(), tinhThuong(), tinhPhuCap(), tinhThuNhap());
    }
}
