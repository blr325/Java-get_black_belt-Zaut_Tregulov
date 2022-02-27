package collection.tree_set;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Андрей",23);
        Student st2 = new Student("Дмитрий",36);
        Student st3 = new Student("Алексей",17);
        Student st4 = new Student("Николай",42);
        Student st5 = new Student("Михаил",34);
        TreeSet<Student> treeSet = getStudents(st1, st2, st3, st4, st5);
        printTreeSet(treeSet);
        System.out.println("treeSet.first() = " + treeSet.first());
        System.out.println("treeSet.last() = " + treeSet.last());

    }

    private static TreeSet<Student> getStudents(Student st1, Student st2, Student st3, Student st4, Student st5) {
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        return treeSet;
    }

    private static void printTreeSet(TreeSet<Student> treeSet) {
        for (Student student : treeSet) {
            System.out.println(student);
        }
    }
}
