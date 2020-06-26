package main.java.com.hw3;

import main.java.com.hw3.car.Car;
import main.java.com.hw3.circle.Circle;
import main.java.com.hw3.count.FlowerCount;

public class Main {
    public static final int RADIUS = 13;

    public static void main(String[] args) {
        Circle circle = new Circle(RADIUS);
        System.out.println(circle);

        new FlowerCount();
        new FlowerCount();
        new FlowerCount();
        System.out.println("Amout of objects: " + FlowerCount.getCount());

        Car auto = new Car();
        auto.setColor("Pink");
        auto.setName("Fiat");
        auto.startMotor();
        auto.keepSpeed(120);
        auto.stopMotor();
    }
}
