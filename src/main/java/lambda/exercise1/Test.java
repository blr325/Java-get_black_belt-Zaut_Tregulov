package lambda.exercise1;

import java.util.ArrayList;

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

        printInfo(students, (Student st) -> st.getAvrGrade() > 7.0);
        printInfo(students, (Student st) -> st.getAge() > 20);
        printInfo(students, (Student st) -> st.getAge() > 20 && st.getAvrGrade() > 7.0 && st.getSex() == 'w');
    }
}
