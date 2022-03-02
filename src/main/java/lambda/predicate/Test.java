package lambda.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {
    public static void printInfo(ArrayList<Student> students, Predicate<Student> predicate) {
        for (Student student : students) {
            if (predicate.test(student)) {
                System.out.println(student);
            }
        }
        System.out.println("-------------------------------------------------------");
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Andrei", 'm', 23, 7.4));
        students.add(new Student("Elena", 'w', 21, 8.3));
        students.add(new Student("Nikolay", 'm', 19, 9.2));
        students.add(new Student("Evgeniy", 'm', 25, 6.3));
        students.add(new Student("Anastasia", 'w', 18, 8.6));

        Predicate<Student> predicateSex = (student) -> student.getSex() == 'm';
        Predicate<Student> predicateAge = (student) -> student.getAge() > 20;
        Predicate<Student> predicateAvrGrade = (student) -> student.getAvrGrade() > 7.0;

        printInfo(students,predicateAge);
        printInfo(students,predicateAge.and(predicateSex));
        printInfo(students,predicateAvrGrade.negate());

        printInfo(students,predicateAge.or(predicateSex).or(predicateAvrGrade));





    }
}
