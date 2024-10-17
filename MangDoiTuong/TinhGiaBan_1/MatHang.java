package MangDoiTuong.TinhGiaBan_1;

import java.util.Scanner;

public class MatHang {
    private static int dem = 1;
    private String id, tenHang, donVi;
    private double giaNhap, soLuong, phiVanChuyen, thanhTien, giaBan;

    public MatHang(Scanner sc) {
        this.id = String.format("MH%02d", dem++);
        this.tenHang = sc.next();
        this.donVi = sc.next();
        this.soLuong = sc.nextDouble();
        this.giaNhap = sc.nextDouble();
        this.phiVanChuyen = Math.round((this.giaNhap * this.soLuong) * 0.05);
        this.thanhTien = Math.round(this.giaNhap * this.soLuong + this.phiVanChuyen);
        this.giaBan = Math.round(this.thanhTien * 1.02);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.0f %.0f %.0f",
                id, tenHang, donVi,
                phiVanChuyen, thanhTien, giaBan);
    }
}