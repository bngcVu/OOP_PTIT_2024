package MangDoiTuong.DanhSachGiangVienTheoBoMon;

public class Teacher{
    private String id,name,subject;
    static int stt = 1;

    public Teacher(String name, String subject) {
        this.id = String.format("GV%02d", stt++);
        this.name = name;
        this.subject = getSubject(subject);
    }

    public String getSubject(String subject) {
        String[] partSubject = subject.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String part : partSubject) {
            sb.append(Character.toUpperCase(part.charAt(0)));
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + subject;
    }

}