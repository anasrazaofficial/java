package Enum;

public class main {
    public static void main(String[] args) {

        StudentEnum studentEnum = new StudentEnum("Anas", 18, Standard.CLASS_1);
        System.out.println(studentEnum);

        for (Standard standard : Standard.values()) {
            System.out.println(standard);
        }
        System.out.println(Standard.CLASS_2.value);
        System.out.println(Standard.valueOf("CLASS_4").ordinal());
    }
}
