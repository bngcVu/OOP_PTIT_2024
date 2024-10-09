package MangDoiTuong.SoPhuc;

public class SoPhuc {
    private int thuc, ao;

    public SoPhuc() {
    }

    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    SoPhuc add(SoPhuc p) {
        SoPhuc n = new SoPhuc();
        n.thuc = this.thuc + p.thuc;
        n.ao = this.ao + p.ao;
        return n;
    }

    SoPhuc mul(SoPhuc p) {
        SoPhuc n = new SoPhuc();
        n.thuc = this.thuc * p.thuc - this.ao * p.ao;
        n.ao = this.ao * p.thuc + this.thuc * p.ao;
        return n;
    }

    @Override
    public String toString() {
        String s = "";
        s += String.valueOf(this.thuc);
        if (this.ao < 0) s += " - ";
        else s += " + ";
        s += String.valueOf(Math.abs(this.ao)) + 'i';
        return s;
    }
}