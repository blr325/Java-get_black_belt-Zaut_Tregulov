package lambda.function;

import java.util.ArrayList;
import java.util.function.Function;

public class Test {
    public static double avgOfSmth(ArrayList<Student> students, Function<Student, Double> f) {
        double result = 0;
        for (Student student : students) {
            result += f.apply(student);
        }
        return result / students.size();
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Andrei", 'm', 23, 7.4));
        students.add(new Student("Elena", 'w', 21, 8.3));
        students.add(new Student("Nikolay", 'm', 19, 9.2));
        students.add(new Student("Evgeniy", 'm', 25, 6.3));
        students.add(new Student("Anastasia", 'w', 18, 8.6));

        double avrGradeStudents = avgOfSmth(students, (Student::getAvrGrade));
        double avrAgeStudents = avgOfSmth(students, student -> ((double) student.getAge()));
        System.out.printf("Средний бал студентов = %.2f\n", avrGradeStudents);
        System.out.printf("Средний возраст = %.2f\n", avrAgeStudents);
    }
}
