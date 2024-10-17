package MangDoiTuong.TinhGiaBan_2;

import java.util.Comparator;
import java.util.Scanner;

public class Item implements Comparable<Item> {
    private static int dem = 1;
    private String id, tenHang, donVi;
    private double giaNhap, soLuong, phiVanChuyen, thanhTien, giaBan;

    public Item(Scanner sc) {
        this.id = String.format("MH%02d", dem++);
        this.tenHang = sc.next();
        this.donVi = sc.next();
        this.giaNhap = sc.nextDouble();
        this.soLuong = sc.nextDouble();
        this.phiVanChuyen = Math.round((this.giaNhap * this.soLuong) * 0.05);
        this.thanhTien = Math.round(this.giaNhap * this.soLuong + this.phiVanChuyen);
        this.giaBan = Math.ceil((this.thanhTien * 1.02) / this.soLuong / 100) * 100;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.0f %.0f %.0f",
                id, tenHang, donVi,
                phiVanChuyen, thanhTien, giaBan);
    }

    @Override
    public int compareTo(Item p) {
        if (this.giaBan < p.giaBan) return 1;
        return -1;
    }
}
