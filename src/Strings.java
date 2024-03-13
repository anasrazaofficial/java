import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String s1 = new String("Anas");
        System.out.println(s1);

        String s2 = "welcome to split";
        String[] arr = s2.split(" ");
        System.out.println(arr.length);

        String countLetter = "This is my World";
        Scanner scanner = new Scanner(System.in);
        char findLetter = scanner.next().charAt(1);
        int count = 0;
        for (char character : countLetter.toCharArray()) {
            if (findLetter == character) {
                count++;
            }
        }
        System.out.println(count);


    }
}