package Collections;

import java.util.Objects;

public class Book {
    private String name;
    private String author;
    private Integer price;

    public Book(String name, String author, Integer price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && author.equals(book.author) && price.equals(book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, price);
    }
}
