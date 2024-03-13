package Problems;

public class Question11 {
    public static void main(String[] args) {

//                                          (12) Missing number

        int[] arr = {1, 4, 8, 5, 3, 6, 2};
        int sum = 0;
        int largest = 0;
        int arraySum = 0;
        int missingNo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        for (int i = 1; i <= 8; i++) {
            sum += i;
        }
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }
        missingNo = sum - arraySum;
        System.out.println(missingNo);


    }
}
