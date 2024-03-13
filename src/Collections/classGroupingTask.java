package Collections;

import java.util.ArrayList;
import java.util.List;

public class classGroupingTask {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Anas", 4, 12));
        studentList.add(new Student("Ahsan", 2, 12));
        studentList.add(new Student("Ali", 3, 12));
        studentList.add(new Student("Ahmed", 1, 12));
        studentList.add(new Student("Sufyan", 2, 12));
        studentList.add(new Student("Sharif", 2, 12));
        studentList.add(new Student("Taha", 3, 12));
        studentList.add(new Student("Sajjad", 4, 12));
        studentList.add(new Student("Raza", 1, 12));

        List<Student> Class1 = new ArrayList<>();
        List<Student> Class2 = new ArrayList<>();
        List<Student> Class3 = new ArrayList<>();
        List<Student> Class4 = new ArrayList<>();

        for (Student s : studentList) {
            if (s.getGrade() == 1) {
                Class1.add(s);
            } else if (s.getGrade() == 2) {
                Class2.add(s);
            } else if (s.getGrade() == 3) {
                Class3.add(s);
            } else {
                Class4.add(s);
            }
        }
        System.out.println("Class 1 =");
        Class1.forEach(System.out::println);
        System.out.println(" ");
        System.out.println("Class 2 =");
        Class2.forEach(System.out::println);
        System.out.println(" ");
        Class3.forEach(System.out::println);
        System.out.println(" ");
        System.out.println("Class 4 =");
        Class4.forEach(System.out::println);
    }

}
