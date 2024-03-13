package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//[A,B,B,C,D,A,C]
//=>[B,C,D,A,C]
//=>[D,A,C]
public class stack {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("Anas");
        names.push("Ahsan");
        names.push("Ahmed");
        names.push("Ali");
//        names.forEach(System.out::println);

        Stack<Bike> bikes = new Stack<>();
        bikes.push(new Bike("Honda", 40000.00, 2020));
        bikes.push(new Bike("Kawasaki", 50000.00, 2014));
        bikes.push(new Bike("Unique", 30000.00, 2018));
        bikes.push(new Bike("Honda", 40000.00, 2020));

//        System.out.println("pop:" + bikes.pop());
//        System.out.println("peek:" + bikes.peek());
//        System.out.println("x------------------------x------------------------x");
//        bikes.forEach(System.out::println);






//        Stack<Character> arr = new Stack<>();
//        Integer ans = 0;
//        arr.push('+');
//        arr.push('3');
//        arr.push('-');
//        arr.push('1');
//        arr.push('+');
//        arr.push('2');
//
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.peek() == '+') {
//                ans += arr.peek(i + 1);
//            } else if (arr.peek() == '-') {
//                ans -= arr.peek(i + 1);
//            } else {
//                ans = Integer.valueOf(arr.peek(i));
//            }
//        }
//        System.out.println(ans);

    }
}
