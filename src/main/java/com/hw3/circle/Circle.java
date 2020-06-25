package main.java.com.hw3.circle;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    private double calculateArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "The Area of the Circle{radius=" + radius +
                "}: " + calculateArea();
    }
}
