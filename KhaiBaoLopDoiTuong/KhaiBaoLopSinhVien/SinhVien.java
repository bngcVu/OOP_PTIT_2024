package KHAI_BAO_LOP_DOI_TUONG.KhaiBaoLopSinhVien;

public class SinhVien {
    private String id;
    private String name;
    private String className;
    private String birth;
    private float gpa;

    public SinhVien () {
        id = "";
        name = "";
        className = "";
        birth = "";
        gpa = 0;
    }

    public SinhVien (String id, String name, String className, String birth, float gpa) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.birth = birth;
        this.gpa = gpa;
    }
    public void chuanHoa() {
        StringBuilder newBirth = new StringBuilder(birth);
        if (newBirth.charAt(1) == '/') {
            newBirth.insert(0, "0");
        }
        if (newBirth.charAt(4) == '/') {
            newBirth.insert(3, "0");
        }
        birth = newBirth.toString();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + birth + " " + String.format("%.2f", gpa);
    }

}
