package MangDoiTuong.SapXepDanhSachMatHang;

public class MatHang implements Comparable<MatHang>{
    private int stt = 1;
    private int id;
    private String name,type;
    private double purchasePrice,salePrice;
    public double profit;

    MatHang(String name, String type, double purchasePrice, double salePrice) {
        this.id = stt++;
        this.name = name;
        this.type = type;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.profit = (double) Math.round((this.salePrice - this.purchasePrice)*100)/100;
    }

    @Override
    public String toString(){
        return String.valueOf(this.id)+' '+this.name+' '+this.type+' ';
    }

    @Override
    public int compareTo(MatHang o) {
        if(this.profit<o.profit) return 1;
        return -1;
    }

}
