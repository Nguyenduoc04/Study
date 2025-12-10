package lession2.study;

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number(number < 1000 and number > 0): ");
        int number = scanner.nextInt();
        int sum = 0;
        if(number > 1000 || number < 0){
            System.out.println("Invalid number!");
        } else{
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println("Sum: " + sum);
        }

    }
}
