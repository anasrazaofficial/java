package Generic;

import java.util.List;

public class PrintAllDataInArray {

    public static <T> void printArr(T[] arr) {
        for (T el : arr) {
            System.out.print(el);
        }
    }

    public static <T> void printList(List<T> arr) {
        for (T el : arr) {
            System.out.println(el);
        }
    }
}
