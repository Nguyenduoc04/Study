import java.util.Scanner;
public class ChangeMoney {
    public static void main(String[] args) {
        int money;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money: ");
        money = scanner.nextInt();
        System.out.println("Change: " + money * 23000 + "VND");
    }
}
