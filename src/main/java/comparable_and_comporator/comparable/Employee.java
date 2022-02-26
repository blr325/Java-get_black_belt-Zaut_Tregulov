package comparable_and_comporator.comparable;

public class Employee implements Comparable<Employee> {
    private String name;
    private String surName;
    private int age;

    public Employee(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        int compareName = this.name.compareTo(anotherEmployee.name);
        if (compareName == 0) {
            return this.surName.compareTo(anotherEmployee.surName);
        } else {
            return compareName;
        }
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
