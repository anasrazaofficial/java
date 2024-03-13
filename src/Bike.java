public class Bike {
    String brand;
    String colour;

    public Bike(String brand, String color) {
        this.brand = brand;
        colour = color;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
