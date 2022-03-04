package streams;

import java.util.ArrayList;

public class Peak {

    public static void setStudentsAge(Student student){
        student.setAge(student.getAge() + 1);
    }
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Andrei", 'm', 23, 7.4));
        students.add(new Student("Elena", 'w', 21, 8.3));
        students.add(new Student("Nikolay", 'm', 19, 9.2));
        students.add(new Student("Evgeniy", 'm', 25, 6.3));
        students.add(new Student("Anastasia", 'w', 18, 8.6));

        students.stream().peek(System.out::println).peek(Peak::setStudentsAge).forEach(System.out::println);
    }
}
