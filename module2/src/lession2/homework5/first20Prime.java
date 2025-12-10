import java.util.Scanner;

public class first20Prime {
    public static void main(String[] args) {
        int numbers;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        numbers = scanner.nextInt();
        int count = 0;
        System.out.println("The prime numbers are: ");
        if(numbers < 2){
            System.out.println("Invalid number!");
        }
        for (int N = 2; N <= numbers; N++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(N);
            }
        }
        }
    }