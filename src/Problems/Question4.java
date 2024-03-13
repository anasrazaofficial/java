package Problems;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

//                                            (06)Frequncy

        int[] occurenceArray = {1, 6, 2, 6, 4, 6, 1, 4, 3, 2};
        Scanner sc = new Scanner(System.in);
        int presentNo = sc.nextInt();
        int countPN = 0;
        for (int el : occurenceArray) {
            if (presentNo == el) {
                countPN++;
            }
        }
//        System.out.println(countPN);
    }
}
