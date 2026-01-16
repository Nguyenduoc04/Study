package lession7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        Circle c1 = new Circle(radius);

        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Circle Area: " + c1.getArea());

        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();

        Rectangle r1 = new Rectangle(length, width);
        System.out.println("Rectangle Area: " + r1.getArea());
    }

}
