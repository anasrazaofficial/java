package Inheritance;

public class Samsung extends Mobile {
    public Samsung(String model, String color, Integer price) {
        super(model, color, price);
    }

    @Override
    public String toString() {
        return "animaLInheritance.Samsung{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
