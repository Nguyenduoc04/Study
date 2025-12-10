package lession2.study;

import java.util.Scanner;

public class DoWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            int sum = 0;
            System.out.println("Nhap vao so nguyen duong n (< 10): ");
            n = Integer.parseInt(scanner.nextLine());
            if (n > 10) {
                break;
            }

            int i = 1;
            while (i <= n){
                sum += i;
                i++;
            }
            System.out.println("Tong cac so tu 1 den " + n + " la: " + sum);
        }while (n <= 10);
    }
}
