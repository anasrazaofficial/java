package Inheritance;

public class Iphone extends Mobile {
    public Iphone(String model, String color, Integer price) {
        super(model, color, price);
    }

    @Override
    public String toString() {
        return "animaLInheritance.Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}