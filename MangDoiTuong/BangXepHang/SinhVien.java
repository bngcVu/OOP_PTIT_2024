package MangDoiTuong.BangXepHang;

public class SinhVien implements Comparable<SinhVien>{
    private String hoTen;
    private int soLanLamBaiDung;
    private long soLanNopBai;


    public SinhVien(String hoTen, int soLanLamBaiDung, long soLanNopBai) {
        this.hoTen = hoTen;
        this.soLanLamBaiDung = soLanLamBaiDung;
        this.soLanNopBai = soLanNopBai;
    }

    @Override
    public int compareTo(SinhVien p) {
        if (this.soLanLamBaiDung != p.soLanLamBaiDung) {
            return Integer.compare(p.soLanLamBaiDung, this.soLanLamBaiDung);
        }
        if (this.soLanNopBai != p.soLanNopBai) {
            return Long.compare(this.soLanNopBai, p.soLanNopBai);
        }
        return this.hoTen.compareTo(p.hoTen);
    }
    @Override
    public String toString() {
        return hoTen + ' ' + soLanLamBaiDung + ' ' + soLanNopBai;
    }
}
