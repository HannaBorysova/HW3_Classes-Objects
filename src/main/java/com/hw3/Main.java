package main.java.com.hw3;

import main.java.com.hw3.car.Car;
import main.java.com.hw3.circle.Circle;
import main.java.com.hw3.count.FlowersCount;

public class Main {
    public static final int RADIUS = 13;
    public static final int SPEED = 120;

    public static void main(String[] args) {
        Circle circle = new Circle(RADIUS);
        System.out.println(circle);

        new FlowersCount();
        new FlowersCount();
        new FlowersCount();
        System.out.println("Amout of objects: " + FlowersCount.getCount());

        Car auto = new Car();
        auto.name = "Fiat ";
        auto.color = "Pink ";
        auto.startMotor();
        auto.keepSpeed(SPEED);
        auto.stopMotor();
    }
}