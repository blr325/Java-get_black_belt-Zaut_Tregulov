package IO_and_NIO.serialization.programmer1;

import java.io.Serial;
import java.io.Serializable;

public class Employee implements Serializable {
    @Serial
    private static final long serialVersionUID = 1;
    private String name;
    private String surName;
    private String position;
    private int age;
    transient private int salary;
    private Car car;

    public Employee(String name, String surName, String position, int age, int salary, Car car) {
        this.name = name;
        this.surName = surName;
        this.position = position;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
