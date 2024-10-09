package MangDoiTuong.SapXepTheoMaSinhVien;

public class Students implements Comparable<Students>{
    private String msv, name, classStudents, email;


    public Students(String msv, String name, String classStudents, String email) {
        this.msv = msv;
        this.name = name;
        this.classStudents = classStudents;
        this.email = email;
    }

    @Override
    public int compareTo(Students other) {
        return this.msv.compareTo(other.msv);
    }

    @Override
    public String toString(){
        return msv + ' ' + name + ' ' + classStudents + ' ' + email;
    }
}
