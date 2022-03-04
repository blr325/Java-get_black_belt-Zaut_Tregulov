package streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        Student st1 = (new Student("Andrei", 'm', 23, 7.4));
        Student st2 = (new Student("Elena", 'w', 21, 8.3));
        Student st3 = (new Student("Nikolay", 'm', 19, 9.2));
        Student st4 = (new Student("Evgeniy", 'm', 25, 6.3));
        Student st5 = (new Student("Anastasia", 'w', 18, 8.6));

        ArrayList<Student> course3 = new ArrayList<>();
        course3.add(st1);
        course3.add(st2);
        course3.add(st3);
        ArrayList<Student> course4 = new ArrayList<>();
        course4.add(st4);
        course4.add(st5);
        ArrayList<ArrayList<Student>> courses = new ArrayList<>();
        courses.add(course3);
        courses.add(course4);

        courses.stream().flatMap(Collection::stream).forEach(student -> System.out.println(student.getName()));
        courses.stream().flatMap(Collection::stream).map(student -> student.getName().toUpperCase(Locale.ROOT)).forEach(System.out::println);
    }
}
