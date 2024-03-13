package Inheritance;

public class Mobile {
    String model;
    String color;
    Integer price;

    public Mobile(String model, String color, Integer price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void turnOn() {
        System.out.println("Turning on mobile");
    }

    public void turnOff() {
        System.out.println("Turning on mobile");
    }
}
