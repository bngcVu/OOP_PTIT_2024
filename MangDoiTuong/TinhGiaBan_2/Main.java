package MangDoiTuong.TinhGiaBan_2;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        List<Item> ds = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            ds.add(new Item(sc));
        }
        Collections.sort(ds);
        for (Item matHang: ds) {
            System.out.println(matHang);
        }
    }
}
