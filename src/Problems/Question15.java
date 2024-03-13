package Problems;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {

//                                      (22)Factorials

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
