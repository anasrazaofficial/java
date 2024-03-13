package Problems;

public class Question6 {
    public static void main(String[] args) {

//                                      (11)Cyclical rotation
       int[] arr = {79, 41, 29, 673, 54};
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        for (int el : arr) {
            System.out.println(el);
        }



    }

}

