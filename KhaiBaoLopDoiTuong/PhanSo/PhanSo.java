package KHAI_BAO_LOP_DOI_TUONG.PhanSo;

public class PhanSo {
    private long tuSo;
    private long mauSo;

    public PhanSo(long tuSo, long mauSo) {
        //if (mauSo == 0) throw new IllegalArgumentException();
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        toiGian();
    }

    // Phương thức tìm ước số chung lớn nhất (USCLN)
    private long ucln(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // Phương thức tối giản phân số
    private void toiGian() {
        long ucln = ucln(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;
    }

    // Phương thức in phân số
    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}
