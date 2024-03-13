package Problems;

public class Question5 {
    public static void main(String[] args) {

//                                    (08)Sub-Array with given Sum

        int[] subArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int findSum = 13;
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < subArray.length; i++) {
            int sum = 0;
            for (int j = i; j < subArray.length; j++) {
                sum = sum + subArray[j];
                if (findSum == sum) {
                    firstIndex = subArray[i];
                    secondIndex = subArray[j];
                    break;
                } else if (sum > findSum) {
                    break;
                }
            }
            if (findSum == sum) {
                break;
            }
        }
        System.out.println("First index: " + firstIndex);
        System.out.println("Second index: " + secondIndex);

    }

}