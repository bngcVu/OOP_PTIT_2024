package MangDoiTuong.TinhGiaBan_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        List<MatHang> ds = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            ds.add(new MatHang(sc));
        }

        for (MatHang matHang: ds) {
            System.out.println(matHang);
        }
    }
}
