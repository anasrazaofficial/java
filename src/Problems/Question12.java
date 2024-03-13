package Problems;

public class Question12 {
    public static void main(String[] args) {

//                                          (17) First repeating element

        int[] arr = {1, 4, 2, 8, 9, 0, 8};
        boolean found = true;
        int dup = 0;
        for (int i = 0; i < arr.length; i++) {
            if (found) {
                for (int j = 0; j < arr.length; j++) {
                    if (i != j) {
                        if (arr[i] == arr[j]) {
                            dup = i;
                            found = false;
                            break;
                        }
                    }
                }
            } else {
                break;
            }
        }
        System.out.println(dup);
    }
}