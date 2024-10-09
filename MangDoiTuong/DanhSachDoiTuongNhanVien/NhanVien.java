package MangDoiTuong.DanhSachDoiTuongNhanVien;

import java.util.Scanner;

public class NhanVien {
    private String mnv, ten, gioiTinh, ngaySinh, diaChi, thue, ngayKy;
    private static int stt = 1;
    NhanVien(){
        this.mnv = String.format("%05d", stt++);
        this.ten = "";
        this.gioiTinh = "";
        this.ngaySinh = "";
        this.diaChi = "";
        this.thue = "";
        this.ngayKy = "";
    }
    public NhanVien(Scanner sc){
        this();
        this.ten =sc.nextLine();
        this.gioiTinh =sc.nextLine();
        this.ngaySinh =sc.nextLine();
        this.diaChi =sc.nextLine();
        this.thue =sc.nextLine();
        this.ngayKy =sc.nextLine();

    }


    @Override
    public String toString() {
        return mnv + " " + ten + ' ' + gioiTinh + ' ' + ngaySinh + ' ' + diaChi + ' ' + thue + ' ' + ngayKy;
    }
}
