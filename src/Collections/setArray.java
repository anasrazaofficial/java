package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setArray {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(14);
        set.add(3);
        set.add(41);
        set.add(2);
//        System.out.println(set);
//        set.forEach(el -> System.out.print(el+" "));

        Book book1 = new Book("Bang e dara", "Allama iqbal", 200);
        Book book2 = new Book("Romeo Juliet", "Williams shakespeare", 400);
        Book book3 = new Book("The book of Shahid Afridid", "Shahid Afridi", 300);
        Book book4 = new Book("The book of Shahid Afridid", "Shahid Afridi", 300);
        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
//        books.forEach(el -> System.out.println(el));
//        books.forEach(System.out::println);


        Bike bike1 = new Bike("Unique", 40000.00, 2020);
        Bike bike2 = new Bike("Honda", 50000.00, 2014);
        Bike bike3 = new Bike("Kawasaki", 30000.00, 2018);
        Bike bike5 = new Bike("Kawasaki", 30000.00, 2018);
        Bike bike4 = new Bike("Honda", 40000.00, 2020);
        Set<Bike> bikeSet1 = new HashSet<>();
        bikeSet1.add(bike1);
        bikeSet1.add(bike2);
        bikeSet1.add(bike3);
        bikeSet1.add(bike5);
        bikeSet1.add(bike4);
        bikeSet1.forEach(System.out::println);

        System.out.println(" ");

        Set<Bike> bikeSet2 = new LinkedHashSet<>();
        bikeSet2.add(bike1);
        bikeSet2.add(bike2);
        bikeSet2.add(bike3);
        bikeSet2.add(bike4);
//        bikeSet2.forEach(System.out::println);

        System.out.println(" ");

        Set<Bike> bikeSet3 = new TreeSet<>();
        bikeSet3.add(bike1);
        bikeSet3.add(bike2);
        bikeSet3.add(bike3);
        bikeSet3.add(bike4);
//        bikeSet3.forEach(System.out::println);

        Set<Shop> set1 = new HashSet<>();
        set1.add(new Shop("abc"));
        set1.add(new Shop("abc"));
        set1.forEach(System.out::println);
    }
}
