package Problems;

public class Question8 {
    public static void main(String[] args) {

//                                            (07)Array sorting(0s, 1s & 2s)

        int[] array={2,0,1,0,1,0,2,1};
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

    }
}
