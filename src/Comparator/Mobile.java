package Comparator;

public class Mobile {
    private String name;
    private String colour;
    private Integer price;

    public Mobile(String name, String colour, Integer price) {
        this.name = name;
        this.colour = colour;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
