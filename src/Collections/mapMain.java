package Collections;

import java.util.*;

public class mapMain {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(1, Arrays.asList(1, 2, 3, 4));
        map.put(2, Arrays.asList());
        map.put(3, Arrays.asList(1, 3, 4));
        map.put(4, Arrays.asList(1, 2));

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//            System.out.println(" ");
        }

//X--------------------------------------------------X-----------------------------------------------------------------X

        char[] arr = {'a', 'b', 'a', 'c', 'b', 'a'};
        Map<Character, Integer> frequency = new HashMap<>();
        for (char c : arr) {
            if (frequency.containsKey(c)) {
                frequency.put(c, frequency.get(c) + 1);
            } else {
                frequency.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> i : frequency.entrySet()) {
//            System.out.println(i.getKey() + " : " + i.getValue());
        }

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Anas", 4, 18));
        studentList.add(new Student("Ahsan", 2, 16));
        studentList.add(new Student("Ali", 3, 12));
        studentList.add(new Student("Ahmed", 1, 14));
        studentList.add(new Student("Sufyan", 2, 14));
        studentList.add(new Student("Sharif", 2, 11));
        studentList.add(new Student("Taha", 3, 18));
        studentList.add(new Student("Sajjad", 4, 21));
        studentList.add(new Student("Raza", 1, 17));

        Map<Integer, List<Student>> studentMap = new HashMap<>();
        for (Student student : studentList) {
            if (studentMap.containsKey(student.getGrade())) {
                studentMap.get(student.getGrade()).add(student);
            } else {
                studentMap.put(student.getGrade(), new ArrayList<>(Arrays.asList(student)));
            }
        }

        for (Map.Entry<Integer, List<Student>> el : studentMap.entrySet()) {
            System.out.println("Clas " + el.getKey() + " : " + el.getValue());
        }

    }
}