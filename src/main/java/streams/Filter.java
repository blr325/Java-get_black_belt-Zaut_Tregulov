package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Andrei", 'm', 23, 7.4));
        students.add(new Student("Elena", 'w', 21, 8.3));
        students.add(new Student("Nikolay", 'm', 19, 9.2));
        students.add(new Student("Evgeniy", 'm', 25, 6.3));
        students.add(new Student("Anastasia", 'w', 18, 8.6));

        List<Student> studentsAgeOver20 = students.stream().filter(student -> student.getAge() > 20).toList();
        List<Student> studentsAvrGradeOver7 = students.stream().filter(student -> student.getAvrGrade() > 7).toList();
        Set<Student> studentsMen = students.stream().filter(student -> student.getSex() == 'm').collect(Collectors.toSet());

        System.out.println("Возраст старше 20");
        studentsAgeOver20.forEach(System.out::println);
        System.out.println("Средний балл выше 7");
        studentsAvrGradeOver7.forEach(System.out::println);
        System.out.println("Мужчины");
        studentsMen.forEach(System.out::println);
    }
}
