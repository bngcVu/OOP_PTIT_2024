package MangDoiTuong.LietKeSinhVienTheoNganh;

public class Students {
    String id, name, className, email;


    public Students(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }


    @Override
    public String toString() {
        return id + ' ' + name + ' ' + className + ' ' + email;
    }
}
