package Problems;

public class Question17 {
    public static void main(String[] args) {

//                                      (16)Common elements

        int[] arr1 = {1, 7, 4, 5};
        int[] arr2 = {3, 2, 9, 4};
        int[] arr3 = {6, 4, 0, 8};
        int common = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    for (int k = 0; k < arr3.length; k++) {
                        if (arr3[k] == arr2[j]) {
                            common = arr3[k];
                        }
                    }
                }
            }
        }
        System.out.println(common);
    }
}
