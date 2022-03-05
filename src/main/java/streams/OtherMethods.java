package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OtherMethods {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Andrei", 'm', 23, 7.4));
        students.add(new Student("Elena", 'w', 21, 8.3));
        students.add(new Student("Nikolay", 'm', 19, 9.2));
        students.add(new Student("Evgeniy", 'm', 25, 6.3));
        students.add(new Student("Anastasia", 'w', 18, 8.6));

        System.out.println("Первый студент в списке - " + students.stream().findFirst().get());
        Student juniorStudents = students.stream().min(Comparator.comparingInt(Student::getAge)).get();
        Student seniorStudents = students.stream().max(Comparator.comparingInt(Student::getAge)).get();
        System.out.printf("Младший студент - %s\nСтарший студент - %s\n", juniorStudents, seniorStudents);

        System.out.println("Первые 2 студента:");
        students.stream().limit(2).forEach(System.out::println);
        System.out.println("Последние 2 студента:");
        students.stream().skip(3).forEach(System.out::println);

        List<Integer> studentsAge = students.stream().mapToInt(Student::getAge).boxed().toList();
        List<Integer> studentsAge2 = students.stream().map(Student::getAge).toList();

        int sum = students.stream().mapToInt(Student::getAge).sum();
        double max = students.stream().mapToDouble(Student::getAvrGrade).max().getAsDouble();
        double average = students.stream().mapToDouble(Student::getAvrGrade).average().getAsDouble();
        System.out.printf("Сумарный возраст = %d\nМаксимальный средний балл = %.2f\nCредний балл студентов =%.2f",sum,max,average);
    }
}
