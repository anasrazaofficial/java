package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {

//                                      (05)Kth smallest value

        int[] ar = {33, 67, 12, 52, 95, 49};
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        for (int j = 0; j < ar.length - 1; j++) {
            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i] > ar[i + 1]) {
                    int temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;
                }
            }
        }
        System.out.println(ar[K - 1]);
    }
}
