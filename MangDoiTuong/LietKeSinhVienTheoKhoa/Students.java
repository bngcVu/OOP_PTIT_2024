package MangDoiTuong.LietKeSinhVienTheoKhoa;

public class Students {
    String id, name, classStudent, email;


    public Students(String msv, String name, String classStudent, String email) {
        this.id = msv;
        this.name = name;
        this.classStudent = classStudent;
        this.email = email;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + classStudent + " " + email;
    }
}
