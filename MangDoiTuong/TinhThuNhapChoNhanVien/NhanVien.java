package MangDoiTuong.TinhThuNhapChoNhanVien;

public class NhanVien {
    private static int dem = 1;
    private String maNV;
    private String hoTen;
    private String chucVu;
    private double luongCoBan;
    private int soNgayCong;
    private double phuCap;
    private double luongChinh;
    private double tamUng;
    private double conLai;


    public NhanVien(String hoTen, String chucVu, double luongCoBan, int soNgayCong) {
        this.maNV = String.format("NV%02d", dem++);
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        tinhLuong();
    }

    private void tinhLuong() {
        this.phuCap = tinhPhuCap();
        this.luongChinh = luongCoBan * soNgayCong;
        this.tamUng = tinhTamUng();
        this.conLai = luongChinh + phuCap - tamUng;
    }

    private double tinhPhuCap() {
        switch (chucVu) {
            case "GD": return 500;
            case "PGD": return 400;
            case "TP": return 300;
            case "KT": return 250;
            default: return 100;
        }
    }
    private double tinhTamUng() {
        double tongThuNhap = phuCap + luongChinh;
        if (tongThuNhap * 2 / 3 < 25000) {
            return Math.round((tongThuNhap * 2 / 3) / 1000) * 1000;
        } else {
            return 25000;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f %.0f %.0f",
                maNV, hoTen, phuCap, luongChinh, tamUng, conLai);
    }
}
