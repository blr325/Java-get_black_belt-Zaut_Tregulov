package lambda.predicate;

public class Student {
    private String name;
    private char sex;
    private int age;
    private double avrGrade;

    public Student(String name, char sex, int age, double avrGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.avrGrade = avrGrade;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public double getAvrGrade() {
        return avrGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", avrGrade=" + avrGrade +
                '}';
    }
}
