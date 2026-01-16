package lession7;

public class Circle  extends GeometricShape{
    private double radius;
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
