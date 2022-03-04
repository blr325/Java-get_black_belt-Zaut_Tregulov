package streams;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Andrei", 'm', 23, 7.4));
        students.add(new Student("Elena", 'w', 21, 8.3));
        students.add(new Student("Nikolay", 'm', 19, 9.2));
        students.add(new Student("Evgeniy", 'm', 25, 6.3));
        students.add(new Student("Anastasia", 'w', 18, 8.6));

        students.stream().forEach(student -> {
            student.setAvrGrade(student.getAvrGrade() + 1.0);
            System.out.println(student);
        });

        ArrayList<String> list = new ArrayList<>();
        list.add("Андрей");
        list.add("Артем");
        list.add("Максим");
        list.add("Дмитрий");

        list.forEach(ForEach::addCountry);
        students.forEach(ForEach::addCountry);


    }

    public static void addCountry(String name) {
        if (name.startsWith("А")) name += " из Беларуси";
        else name += " из России";
        System.out.println(name);
    }

    public static void addCountry(Student student) {
        if (student.getName().startsWith("A")) student.setName(student.getName() +" in Belarus");
        else student.setName(student.getName() +" in Russia");
        System.out.println(student);
    }
}
