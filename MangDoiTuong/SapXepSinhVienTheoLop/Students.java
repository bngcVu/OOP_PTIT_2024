package MangDoiTuong.SapXepSinhVienTheoLop;

public class Students implements Comparable<Students>{
    private String msv;
    private String name;
    private String classStudent;
    private String email;


    public Students(String msv, String name, String classStudent, String email) {
        this.msv = msv;
        this.name = name;
        this.classStudent = classStudent;
        this.email = email;
    }

    @Override
    public int compareTo(Students other){
        int classCompare = this.classStudent.compareTo(other.classStudent);
        if (classCompare != 0){
            return classCompare;
        }
        return this.msv.compareTo(other.msv);
    }
    @Override
    public String toString(){
        return msv + ' ' + name + ' ' + classStudent + ' ' + email;
    }
}
