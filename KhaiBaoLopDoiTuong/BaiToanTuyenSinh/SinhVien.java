package KHAI_BAO_LOP_DOI_TUONG.BaiToanTuyenSinh;

public class SinhVien {
    private String id;
    private String name;
    private String status; // TRUNG TUYEN hoac TRUOT
    private double scoreT, scoreL, scoreH, priorityScore, totalScore;

    public SinhVien(String id, String name, double scoreT, double scoreL, double scoreH) {
        this.id = id;
        this.name = name;
        this.scoreT = scoreT;
        this.scoreL = scoreL;
        this.scoreH = scoreH;
        this.priorityScore = 0;
        if (id.startsWith("KV1")) this.priorityScore = 0.5;
        if (id.startsWith("KV2")) this.priorityScore = 1.0;
        if (id.startsWith("KV3")) this.priorityScore = 2.5;
        this.totalScore = this.scoreT*2 + this.scoreL + this.scoreH;
        if (this.totalScore + this.priorityScore >= 24) this.status = "TRUNG TUYEN";
        else this.status = "TRUOT";
    }

    void inThongTin(){
        System.out.print(this.id+' '+this.name+' ');
        if((int)this.priorityScore == this.priorityScore ) System.out.printf("%.0f ",this.priorityScore);
        else  System.out.printf("%.1f ",this.priorityScore);
        if((int)this.totalScore == this.totalScore ) System.out.printf("%.0f ",this.totalScore);
        else  System.out.printf("%.1f ",this.totalScore);
        System.out.println(this.status);
    }

}
