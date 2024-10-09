package KHAI_BAO_LOP_DOI_TUONG.ThiThuNhapGiaoVien;

public class GiaoVien {
    private String id;
    private String name;
    private long basicSalary; // lương cơ bản
    private long allowance; // trợ cấp
    private long income; // thu nhập
    private int saralyScale; // thang lương

    public GiaoVien(String id, String name, long basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        if (id.charAt(0) == 'H') {
            if (id.charAt(1) == 'T')
                this.allowance = 2000000;
        }
        if (id.charAt(0) == 'H') {
            if (id.charAt(1) == 'P')
                this.allowance = 900000;;
        }
        if (id.charAt(0) == 'G') {
            if (id.charAt(1) == 'V')
                this.allowance = 500000;
        }
        this.saralyScale = Integer.parseInt(id.substring(2));
        this.income = this.basicSalary * this.saralyScale + this.allowance;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + saralyScale + " " + allowance + " " + income;
    }
}
