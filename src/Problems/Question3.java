package Problems;

public class Question3 {
    public static void main(String[] args) {

//                                                   (04)array sort
        int[] ar = {2, 5, 8, 4, 1, 9};
        for (int j = 0; j < ar.length - 1; j++) {
            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i] > ar[i + 1]) {
                    int temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }
    }
}
