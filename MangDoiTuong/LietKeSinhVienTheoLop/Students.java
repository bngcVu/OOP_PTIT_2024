package MangDoiTuong.LietKeSinhVienTheoLop;

public class Students {
    private String id, name, classStudents, email;

    public Students(String id, String name, String classStudents, String email) {
        this.id = id;
        this.name = name;
        this.classStudents = classStudents;
        this.email = email;
    }

    public String getClassStudents(){
        return classStudents;
    }

    @Override
    public String toString(){
        return id + ' ' + name + ' ' + classStudents + ' ' + email;
    }
}
