package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listMain {
    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();
        arr.add("Anas");
        arr.add("Taha");
        arr.add("Sajjad");
        arr.add("Raza");
        Collections.sort(arr);
//        System.out.println(arr);
//        System.out.println(arr.size());
//        System.out.println(arr.get(1));


        List<Student> students = new ArrayList<>();
        students.add(new Student("Anas", 12, 18));
        students.add(new Student("Ahsan", 10, 20));
        students.add(new Student("Ahmed", 8, 23));
        students.add(new Student("sharif", 4, 11));
//        System.out.println(students);

        for (Student student : students) {
//            System.out.println(student.getName());
        }

        votingAge(students);

        nameStartsWithA(students);
    }

    private static void nameStartsWithA(List<Student> students) {
        for (Student student : students) {
            if (student.getName().startsWith("A")) {
                System.out.println(student.getName());
            }
        }
    }

    public static void votingAge(List<Student> students) {
        for (Student student : students) {
            if (student.getAge() >= 18) {
                System.out.println(student.getName());
            }
        }
    }
}
