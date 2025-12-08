package lession1.study;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("== TIEM PHO ANH HAI ==");
        System.out.println("Moi chon mon:");
        System.out.println("1. Pho tai");
        System.out.println("2. Pho chin");
        System.out.println("3. Com nguoi");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Ban da chon Pho tai nhieu hanh");
                break;
            case 2:
                System.out.println("Ban da chon Pho chin nhieu hanh");
                break;
            case 3:
                System.out.println("Ban da chon Com nguoi");
                break;
            default:
                System.out.println("Lua chon khong dung!");
        }
    }
}