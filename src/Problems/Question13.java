package Problems;

public class Question13 {
    public static void main(String[] args) {

//                                          (20) Non-repeating element

        int[] arr = {4, 6, -3, -8, 2, 1, -2, 1, -3, -2};
        int length = arr.length;
        int[] integerArr = new int[length];
        int positive = 0;
        int negative = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                integerArr[positive] = arr[i];
                positive += 2;
            } else {
                integerArr[negative] = arr[i];
                negative += 2;
            }
        }
        for (int el : integerArr) {
            System.out.print(el + " ");
        }
    }
}
