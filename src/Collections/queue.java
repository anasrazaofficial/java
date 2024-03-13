package Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> fruits = new PriorityQueue<>();
//        Queue<String> fruits = new ArrayDeque<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Xyz");
        fruits.add("Grape");
        fruits.add("Pear");
        System.out.println(fruits.peek());
        System.out.println(fruits.poll());
        System.out.println(fruits);
        System.out.println(fruits.peek());
        System.out.println(" ");
//        fruits.forEach(s -> System.out.println(s));
    }
}
