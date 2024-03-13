package Problems;

public class Question14 {
    public static void main(String[] args) {

//                                          (21)Subarray with 0 sum

        int[] arr = {4, 2, -3, 1, 6};
        int zero = 0;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == zero) {
                    found = true;
                }
            }
        }
        System.out.println(found);
    }
}
