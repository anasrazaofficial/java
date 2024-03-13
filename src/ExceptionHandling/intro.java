package ExceptionHandling;

import Collections.Student;

import java.util.Locale;

public class intro {
    public static void main(String[] args) {

//ArithmeticEexception
        try {
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println(5 / 0);              //error location
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Thanks");
        System.out.println("Thanks");


//NullPointerException
        watch watch = new watch(null, 18);
        try {
            watch.getName().toLowerCase(Locale.ROOT);
        } catch (Exception e) {
            e.printStackTrace();
        }


//ArrayIndexOfBoundException
        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[4]);


//NumberFormatException
        String num = "123";
        Integer.parseInt(num);
        String any = "abc";
        Integer.parseInt(any);

    }
}
