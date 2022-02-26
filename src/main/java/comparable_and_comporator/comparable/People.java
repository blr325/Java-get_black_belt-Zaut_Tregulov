package comparable_and_comporator.comparable;

public class People implements Comparable<People> {
    private String name;
    private String surName;
    private int age;


    public People(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }
    @Override
    public int compareTo(People anotherPeople) {
        return this.age-anotherPeople.age;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                "}";
    }
}
