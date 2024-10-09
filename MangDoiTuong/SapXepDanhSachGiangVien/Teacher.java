package MangDoiTuong.SapXepDanhSachGiangVien;

public class Teacher implements Comparable<Teacher>{
    private String id,name,subject, lastName;
    static int stt = 1;

    public Teacher(String name, String subject) {
        this.id = String.format("GV%02d", stt++);
        this.name = name;
        this.lastName = getLastName(name);
        this.subject = getSubject(subject);
    }

    public String getLastName(String name) {
        String[] last = name.split(" ");
        return last[last.length - 1];
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
    public int compareTo(Teacher other) {
        if (this.name.equals(other.name)) {
            return this.id.compareTo(other.id);
        }
        return this.lastName.compareTo(other.lastName);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + subject;
    }

}
