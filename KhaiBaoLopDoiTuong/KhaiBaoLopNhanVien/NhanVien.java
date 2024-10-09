package KHAI_BAO_LOP_DOI_TUONG.KhaiBaoLopNhanVien;

public class NhanVien {
    private String id;
    private String name;
    private String sex;
    private String birth;
    private String adress;
    private String tax;
    private String date;

    /*public NhanVien() {
        id = "";
        name = "";
        sex = "";
        birth = "";
        adress = "";
        tax = "";
        date = "";
    }

     */
    public NhanVien(String id, String name, String sex, String birth, String adress, String tax, String date) {
        this.id = id;
        this.name= name;
        this.sex = sex;
        this.birth = birth;
        this.adress = adress;
        this.tax = tax;
        this.date = date;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sex  + " " + birth + " " + adress + " " + tax + " " + date;
    }
}
