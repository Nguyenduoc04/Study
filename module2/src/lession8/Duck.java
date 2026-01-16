package lession8;

public class Duck  implements Flyable, Swimable {
    @Override
    public void swim() {
        System.out.println("Duck swim");
    }
    @Override
    public void fly() {
        System.out.println("Duck fly");
    }
}
