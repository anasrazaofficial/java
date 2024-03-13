package Collections;

import java.util.Objects;

public class Shop {
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return name.equals(shop.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
