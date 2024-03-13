package Problems;

public class Question10 {
    public static void main(String[] args) {

//                                (10)Union

        int[] arr = {1, 6, 3, 9, 4};
        int[] arr2 = {2, 5, 7, 8, 4, 5};
        int lengthSum = (arr.length) + (arr2.length);
        int[] unionArr = new int[lengthSum];
        for (int i = 0; i < arr.length; i++) {
            unionArr[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < unionArr.length; j++) {
                if (arr2[i] != unionArr[j]) {
                    unionArr[lengthSum - 1] = arr2[i];
                    lengthSum--;
                }
            }
        }

        for (int i = 0; i < unionArr.length; i++) {
            System.out.print(unionArr[i] + " ");
        }
    }
}
