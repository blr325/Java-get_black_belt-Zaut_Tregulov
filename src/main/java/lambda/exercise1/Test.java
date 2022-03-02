package lambda.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void printInfo(ArrayList<Student> students, CheckStudent checkStudent) {
        for (Student student : students) {
            if (checkStudent.check(student)) {
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

        printInfo(students, st -> st.getAvrGrade() > 7.0);
        printInfo(students, st -> st.getAge() > 20);
        printInfo(students, st -> st.getAge() > 20 && st.getAvrGrade() > 7.0 && st.getSex() == 'w');

        Comparator<Student> comparatorAge = (st1, st2) -> st1.getAge() - st2.getAge();
        students.sort(comparatorAge);
        students.forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        Comparator<Student> comparatorName = (st1,st2)-> st1.getName().compareTo(st2.getName());
        students.sort(comparatorName);
        students.forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        students.sort(Comparator.comparingDouble(Student::getAvrGrade));
        students.forEach(System.out::println);





    }
}
