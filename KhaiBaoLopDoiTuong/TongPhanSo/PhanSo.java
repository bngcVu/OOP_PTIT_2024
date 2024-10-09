package KHAI_BAO_LOP_DOI_TUONG.TongPhanSo;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        int ucln = UCLN(tuSo, mauSo);
        this.tuSo /= ucln;
        this.mauSo /= ucln;
    }
    public PhanSo()
    {
        tuSo = mauSo = 1;
    }

    private static int UCLN(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public void rutGon() {
        int ucln = UCLN(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;
    }

    public static PhanSo cong(PhanSo a, PhanSo b) {

        return new PhanSo(a.tuSo * b.mauSo + b.tuSo * a.mauSo, a.mauSo * b.mauSo);
    }

    // Hàm in phân số
    @Override
    public String toString() {
        return tuSo + "/" + mauSo; // Simple string concatenation
    }
}
