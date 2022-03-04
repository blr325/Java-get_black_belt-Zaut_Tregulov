package streams;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Andrei", 'm', 23, 7.4));
        students.add(new Student("Elena", 'w', 21, 8.3));
        students.add(new Student("Nikolay", 'm', 19, 9.2));
        students.add(new Student("Evgeniy", 'm', 21, 6.3));
        students.add(new Student("Anastasia", 'w', 19, 8.6));

        Map<Integer, List<Student>> mapAge = students.stream().collect(Collectors.groupingBy(Student::getAge));
        mapAge.forEach((i, l) -> System.out.println(i + ":" + l));
        Map<Boolean, List<Student>> mapAvrGradeOver8 =
                students.stream().collect(Collectors.partitioningBy(st -> st.getAvrGrade() > 8.0));
        mapAvrGradeOver8.forEach((i, l) -> System.out.println(i + ":" + l));
    }
}
