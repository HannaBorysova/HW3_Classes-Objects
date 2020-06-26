package main.java.com.hw3.car;

public class Car {
    private String name;
    private String color;
    public int speed;

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

    public void startMotor() {
        System.out.println(color + " " + name + " " + "started to drive");
    }

    public void keepSpeed(int speed) {
        System.out.println(color + " " + name + " " + "ride with speed" + " " + speed + " " + "km/h ");
    }

    public void stopMotor() {
        System.out.println(color + " " + name + " " + "stopped to ride");
    }
}
