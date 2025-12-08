package lession1.homework10;
import java.util.Scanner;
public class NumToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number(number > 0): ");
        int number = scanner.nextInt();
        if(number < 0){
            System.out.println("Invalid number!");
            return;
        }
        if(number < 10){
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }else if(number < 20){
            switch (number) {
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            String text ="";
            switch (tens) {
                case 2:
                    text += "Twenty";
                    break;
                case 3:
                    text += "Thirty";
                    break;
                case 4:
                    text += "Forty";
                    break;
                case 5:
                    text += "Fifty";
                    break;
                case 6:
                    text += "Sixty";
                    break;
                case 7:
                    text += "Seventy";
                    break;
                case 8:
                    text += "Eighty";
                    break;
                case 9:
                    text += "Ninety";
                    break;
            }
            text += " ";
            switch (ones) {
                case 0:
                    break;
                case 1:
                    text += "One";
                    break;
                case 2:
                    text += "Two";
                    break;
                case 3:
                    text += "Three";
                    break;
                case 4:
                    text += "Four";
                    break;
                case 5:
                    text += "Five";
                    break;
                case 6:
                    text += "Six";
                    break;
                case 7:
                    text += "Seven";
                    break;
                case 8:
                    text += "Eight";
                    break;
                case 9:
                    text += "Nine";
                    break;
            }
            System.out.println(text);
        } else if(number < 1000){
            int  hundreds = number / 100;
            int tens = (number % 100) / 10;
            int ones = (number % 100) % 10;
            String text = "";
            switch (hundreds) {
                case 1:
                    text += "One hundred";
                    break;
                case 2:
                    text += "Two hundred";
                    break;
                case 3:
                    text += "Three hundred";
                    break;
                case 4:
                    text += "Four hundred";
                    break;
                case 5:
                    text += "Five hundred";
                    break;
                case 6:
                    text += "Six hundred";
                    break;
                case 7:
                    text += "Seven hundred";
                    break;
                case 8:
                    text += "Eight hundred";
                    break;
                case 9:
                    text += "Nine hundred";
                    break;
            }
            text += " and ";
            switch (tens) {
                case 2:
                    text += "Twenty";
                    break;
                case 3:
                    text += "Thirty";
                    break;
                case 4:
                    text += "Forty";
                    break;
                case 5:
                    text += "Fifty";
                    break;
                case 6:
                    text += "Sixty";
                    break;
                case 7:
                    text += "Seventy";
                    break;
                case 8:
                    text += "Eighty";
                    break;
                case 9:
                    text += "Ninety";
                    break;
            }
            text += " ";
            switch (ones) {
                case 0:
                    break;
                case 1:
                    text += "One";
                    break;
                case 2:
                    text += "Two";
                    break;
                case 3:
                    text += "Three";
                    break;
                case 4:
                    text += "Four";
                    break;
                case 5:
                    text += "Five";
                    break;
                case 6:
                    text += "Six";
                    break;
                case 7:
                    text += "Seven";
                    break;
                case 8:
                    text += "Eight";
                    break;
                case 9:
                    text += "Nine";
                    break;
            }
            System.out.println(text);
        } else {
            System.out.println("Number exceeding the limit. Please enter number < 1000.");
        }

    }
}
