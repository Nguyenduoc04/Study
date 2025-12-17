package lession3.study;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        double result = sum(8.5, 1.5); // Compile Time Error
        int total = sum(10, 20);
        System.out.println(total);
//
//
//
//
//        System.out.println(args.length);
//        System.out.println(args[0]);
//        sayHello("Ha Noi");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Bạn ở đâu thế?");
//        String tinhCuaToi = scanner.nextLine();
//        sayHello(tinhCuaToi);
        // byte, short, int, long, float, double, char, boolean
//        String[] customers; // khai bao bien mang
//        customers = new String[5]; // khoi tao mang voi kich thuoc 5
//        customers[0] = "Thu Ngoc";
//        customers[1] = "Van Anh";
//        customers[2] = "Minh Tuan";
//        customers[3] = "Hong Nhung";
//        customers[4] = "Quang Huy";

//        System.out.println(customers[0]); // In ra: Thu Ngoc
//        System.out.println(customers[1]); // In ra: Van Anh
//        System.out.println(customers[2]); // In ra: Minh Tuan
//        System.out.println(customers[3]); // In ra: Hong Nhung
//        System.out.println(customers[4]); // In ra: Quang Huy
        // Compile Time Error

        // for (elementType item : arrayName) { }
//        for (String customer : customers) {
//            System.out.println(customer);
//        }

//        for (int i = 0; i < customers.length; i++) {
//            System.out.println(customers[i]);
//        }
    }

    // public, protected, private, default
    static void sayHello(String tinhThanh) {
        System.out.println("Xin chao " + tinhThanh);
    }

    // Overloading - Nap chong phuong thuc
    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }
}