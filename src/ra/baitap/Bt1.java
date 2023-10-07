package ra.baitap;

import java.util.Random;
import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(8)+1);

        int a,b;
        Scanner sc= new Scanner(System.in);
        // nhập vào và tính tôngr 2 số
        System.out.println("Nhập vào số thứ nhất");
        while (true){
            try {
                a = Integer.parseInt(sc.nextLine());
                break;
            }catch (Exception e){
                System.err.println("Nhập không họp lê, vui lòng thử lai");
            }
        }
        System.out.println("Nhập vào số thứ hai");
        while (true){
            try {
                b = Integer.parseInt(sc.next());
                break;
            }catch (Exception e){
                System.err.println("Nhập không họp lê, vui lòng thử lai");
            }
        }

        System.out.println("Tổng 2 số là  :" +(a+b));
        // lỗi chia cho 0

    }


}
