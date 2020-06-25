package main.java.com.hw3.car;

public class Car {
    public String name;
    public String color;

    public void startMotor() {
    System.out.println(color + name + "started to drive");
 }

    public void keepSpeed(int speed) {
    System.out.println(color + name + "ride with speed " + speed + " km/h ");
 }

    public void stopMotor() {
    System.out.println(color + name + "stopped to ride");
 }
}
