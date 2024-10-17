package MangDoiTuong.BangKeTienLuong;

import java.util.Scanner;

class NhanVien {
    private static int dem = 1;
    private String id, hoTen, chucVu;
    private long luongNgay, soNgayCong, luongThang, thuong, phuCap, thucLinh;

    private static final int NGAY_CONG_THUONG_CAO = 25;
    private static final int NGAY_CONG_THUONG_THAP = 22;
    private static final long PHU_CAP_GD = 250000;
    private static final long PHU_CAP_PGD = 200000;
    private static final long PHU_CAP_TP = 180000;
    private static final long PHU_CAP_NV = 150000;

    public NhanVien(Scanner sc) {
        this.id = String.format("NV%02d", dem++);
        this.hoTen = sc.nextLine();
        this.luongNgay = sc.nextLong();
        this.soNgayCong = sc.nextLong();
        sc.nextLine(); // Đọc ký tự xuống dòng còn sót
        this.chucVu = sc.nextLine();

        tinhLuong();
    }

    private void tinhLuong() {
        this.luongThang = this.luongNgay * this.soNgayCong;

        if (this.soNgayCong >= NGAY_CONG_THUONG_CAO) {
            this.thuong = (long) (this.luongThang * 0.2);
        } else if (this.soNgayCong >= NGAY_CONG_THUONG_THAP) {
            this.thuong = (long) (this.luongThang * 0.1);
        } else {
            this.thuong = 0;
        }

        switch (this.chucVu) {
            case "GD":
                this.phuCap = PHU_CAP_GD;
                break;
            case "PGD":
                this.phuCap = PHU_CAP_PGD;
                break;
            case "TP":
                this.phuCap = PHU_CAP_TP;
                break;
            default:
                this.phuCap = PHU_CAP_NV;
        }

        this.thucLinh = this.luongThang + this.phuCap + this.thuong;
    }

    public long getThucLinh() {
        return this.thucLinh;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d",
                id, hoTen, luongThang, thuong, phuCap, thucLinh);
    }
}