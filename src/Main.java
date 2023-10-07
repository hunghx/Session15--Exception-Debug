import ra.exception.TriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Exception
       // một số ngoại lệ sinhh ra thương gặp
//        NullPointerException
        String str = null; // null là giá trị rỗng và
        // không có thuộc tính hay phương thức
//        str.length();
//        IndexOutOfBoundsException
        int[] array = {};
//        array[1]=1;
//        NumberFormatException
        String number = "2n";
//        int s = Integer.parseInt(number);

        convertStringToInteger("2");
        System.out.println("CHương trình tiếp tục");

//        try {
//            getTriangle();
//        }catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }
//        inputTriangle();
    }

    // Xử lí ngoại lệ
    // cách 1 : sử dụng khối try catch
    // ví dụ chuyển đổi chuỗi thânhf số,
    // nếu như không chuyển đổi được thì in ra thông báo lỗi
    public static int convertStringToInteger(String str){
        try {
            int i = Integer.parseInt(str); // phải biết có thể sinh ra ngoại lệ gì
            String nulll = "hung";
            System.out.println(nulll.length());
            return 0;
        }catch (NumberFormatException e){
//                nếu trong khối coe của try có phát sinh ngoại lệ
//                giống hoặc kế thừa ngoại lệ được khai báo trong catch
            System.out.println("CHuỗi không thể chuyển thanh số");
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            // dù có ngoại lệ sinh ra hay không thì đều chạy khối code trong finally
            System.out.println("Đóng thao tác");
            // trong thực tế finally dùng để thực hiện các logic dọn dẹp bộ nhớ
        }
        return 1;

    }


    // cách 2 : chưa xử lí - ném ra ngoại lệ
    // nhập vào 3 cạnh của tam giacs , nếu không thỏa mãn thì ném râ ngoại lệ
    public static void getTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a = ");
        double a = sc.nextDouble();
        System.out.println("Nhập b = ");
        double b = sc.nextDouble();
        System.out.println("Nhập c = ");
        double c = sc.nextDouble();
        // kiếm tra đều kiện là 1 tam giác : cách cạnh phải lớn hơn 0,
        // tổng 2 cạnh bất kì phải lơn hơn cạnh còn lại
        if(a<=0||b<=0||c<=0){
            // dùng từ khóa throw để ném ra ngoại lệ
            throw new IllegalArgumentException("cách cạnh tam giác phải lớn hơn 0");
        }
        if (a+b<=c||a+c<=b||c+b<=a){
            throw new IllegalArgumentException("Tổng 2 cạnh phải lớn hơn cạnh còn lại");
        }
        System.out.println("các cạn vừa nhập là : a ="+a+", b="+b+", c="+c);
    }

    // cách 3 ném ra ngoại lên trên phương thức
    public static void inputTriangle(){
        try {
            getTriangle();
        }catch (IllegalArgumentException t){
            System.out.println(t.getMessage());
        }
    }
}