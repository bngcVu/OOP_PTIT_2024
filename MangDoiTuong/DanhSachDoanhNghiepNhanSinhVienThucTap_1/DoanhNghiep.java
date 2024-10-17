package MangDoiTuong.DanhSachDoanhNghiepNhanSinhVienThucTap_1;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String id, name;
    private int receiveNumber;


    public DoanhNghiep(String id, String name, int receiveNumber) {
        this.id = id;
        this.name = name;
        this.receiveNumber = receiveNumber;
    }

    @Override
    public String toString() {
        return this.id + ' ' + this.name + ' ' + String.valueOf(this.receiveNumber);
    }

    @Override
    public int compareTo(DoanhNghiep p) {
        if (this.receiveNumber < p.receiveNumber) return 1;
        if (this.receiveNumber > p.receiveNumber) return -1;
        return this.id.compareTo(p.id);
    }
}
