package Inheritance;

public class Nokia extends Mobile {
    public Nokia(String model, String color, Integer price) {
        super(model, color, price);
    }

    @Override
    public String toString() {
        return "animaLInheritance.Nokia{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}