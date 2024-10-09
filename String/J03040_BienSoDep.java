package STRING;

import java.util.Scanner;

public class J03040_BienSoDep {
    static boolean kiemTra(String bienSo){
        if(bienSo.charAt(1) > bienSo.charAt(0)&&bienSo.charAt(2) > bienSo.charAt(1)&&bienSo.charAt(3) > bienSo.charAt(2)&&bienSo.charAt(4) > bienSo.charAt(3)){
            return true;
        }
        if(bienSo.charAt(1) == bienSo.charAt(0)&&bienSo.charAt(2) == bienSo.charAt(1)&&bienSo.charAt(4) == bienSo.charAt(3)){
            return true;
        }
        for(int i = 0;i < bienSo.length();i++){
            if(bienSo.charAt(i) != '6'&&bienSo.charAt(i) != '8') return false;
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.next());

        while (T-- > 0) {
            String bienSo = sc.next();
            bienSo = bienSo.substring(5 ,8) + bienSo.substring(9);
            if(kiemTra(bienSo)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
