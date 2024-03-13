package Collections;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Bike implements Comparable<Bike> {
    private String name;
    private Double Price;
    private Integer model;


    public Bike(String name, Double price, Integer model) {
        this.name = name;
        Price = price;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", Price=" + Price +
                ", model=" + model +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return name.equals(bike.name) && Price.equals(bike.Price) && model.equals(bike.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Price, model);
    }


    @Override
    public int compareTo(@NotNull Bike o) {
        return this.getModel().compareTo(o.getModel());
    }
}
