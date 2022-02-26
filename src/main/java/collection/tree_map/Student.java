package collection.tree_map;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student otherStudent) {
        int result = this.name.compareTo(otherStudent.getName());
        if (result == 0) {
            result = this.age - otherStudent.getAge();
        }
        return result;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
