package streams;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorted {
    public static void main(String[] args) {
        ArrayList<Student> sortedStudents = new ArrayList<>();
        sortedStudents.add(new Student("Andrei", 'm', 23, 7.4));
        sortedStudents.add(new Student("Elena", 'w', 21, 8.3));
        sortedStudents.add(new Student("Nikolay", 'm', 19, 9.2));
        sortedStudents.add(new Student("Evgeniy", 'm', 25, 6.3));
        sortedStudents.add(new Student("Anastasia", 'w', 18, 8.6));
        System.out.println("Сортировка по возрасту");
        sortedStudents.stream().sorted(Comparator.comparingInt(Student::getAge)).forEach(System.out::println);
        System.out.println("Сортировка по среднему баллу");
        sortedStudents.stream().sorted(Comparator.comparingDouble(Student::getAvrGrade)).forEach(System.out::println);


    }
}
