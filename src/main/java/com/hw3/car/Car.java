package main.java.com.hw3.car;

public class Car {
    private String name;
    private String color;
    private int speed;

    public String getName(String Fiat) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor(String pink) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 120) {
            this.speed = 120;
        } else {
            this.speed = speed;
        }
    }

    public void startMotor() {
        System.out.println(color + " " + name + " " + "started to drive");
    }

    public void keepSpeed() {
        System.out.println(color + " " + name + " " + "ride with speed" + " " + speed + " " + "km/h ");
    }

    public void stopMotor() {
        System.out.println(color + " " + name + " " + "stopped to ride");
    }
}
