package Problems;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

//                                      (03)Reverse a string

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char charArr[] = input.toCharArray();
        System.out.println(charArr.length);
        for (int i = charArr.length - 1; i >= 0; i--) {
            System.out.print(charArr[i]);
        }

    }
}
