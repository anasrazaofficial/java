package Problems;

public class Question1 {
    public static void main(String[] args) {

//                                         (02)min and max

        int[] arr = {31, 670, 3, 93, 39, 52};
        int min = 0;
        int max = 0;

        for (int el : arr) {
            if (el > max) {
                max = el;
            }
        }
        for (int el : arr) {
            if (el > min) {
                min = el;
            }
            for (int ele : arr) {
                if (ele < min) {
                    min = ele;
                }
            }
        }
        System.out.println("Maximum number in the array is " + max);
        System.out.println("Minimum number in the array is " + min);
    }
}
