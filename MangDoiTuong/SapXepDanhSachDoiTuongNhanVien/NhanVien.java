package MangDoiTuong.SapXepDanhSachDoiTuongNhanVien;


import java.util.Scanner;

public class NhanVien implements Comparable<NhanVien> {
    private String mnv, ten, gioiTinh, birthday, diaChi, thue, ngayKy;
    private static int stt = 1;
    NhanVien(){
        this.mnv = String.format("%05d", stt++);
        this.ten = "";
        this.gioiTinh = "";
        this.birthday = "";
        this.diaChi = "";
        this.thue = "";
        this.ngayKy = "";
    }
    public NhanVien(Scanner sc){
        this();
        this.ten =sc.nextLine();
        this.gioiTinh =sc.nextLine();
        this.birthday =sc.nextLine();
        this.diaChi =sc.nextLine();
        this.thue =sc.nextLine();
        this.ngayKy =sc.nextLine();

    }
    @Override
    public int compareTo(NhanVien o) {
        int d1 = Integer.parseInt(this.birthday.substring(6));
        int d2 = Integer.parseInt(o.birthday.substring(6));
        if(d1>d2) return 1;
        if(d1<d2) return -1;
        d1 = Integer.parseInt(this.birthday.substring(3,5));
        d2 = Integer.parseInt(o.birthday.substring(3,5));
        if(d1>d2) return 1;
        if(d1<d2) return -1;
        d1 = Integer.parseInt(this.birthday.substring(0,2));
        d2 = Integer.parseInt(o.birthday.substring(0,2));
        if(d1>d2) return 1;
        return -1;
    }


    @Override
    public String toString() {
        return mnv + " " + ten + ' ' + gioiTinh + ' ' + birthday + ' ' + diaChi + ' ' + thue + ' ' + ngayKy;
    }
}


