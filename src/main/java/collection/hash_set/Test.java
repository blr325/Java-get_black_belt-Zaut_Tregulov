package collection.hash_set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Андрей",23);
        Student st2 = new Student("Дмитрий",36);
        Student st3 = new Student("Алексей",17);
        Student st4 = new Student("Николай",42);
        Student st5 = new Student("Михаил",34);
        HashSet<Student> hs = getStudents(st1, st2, st3, st4, st5);
        iteratorHs(hs);
        HashSet<Student> hsClone = new HashSet<>();
        hsClone = (HashSet)hs.clone();
        hsClone.add(new Student("ЕВГЕНИЙ",20));
        iteratorHs(hs);
        iteratorHs(hsClone);
        hsClone.remove(st5);
        hsClone.remove(st4);
        hsClone.remove(st3);
        iteratorHs(hsClone);
        hs.removeAll(hsClone);
        iteratorHs(hs);
    }

    private static HashSet<Student> getStudents(Student st1, Student st2, Student st3, Student st4, Student st5) {
        HashSet<Student> hs = new HashSet<>(32,0.9f);
        hs.add(st1);
        hs.add(st2);
        hs.add(st3);
        hs.add(st4);
        hs.add(st5);
        return hs;
    }

    private static void iteratorHs(HashSet<Student> hs) {
        for (Student h : hs) {
            System.out.println(h);
        }
        System.out.println("-------------------");
    }
}
