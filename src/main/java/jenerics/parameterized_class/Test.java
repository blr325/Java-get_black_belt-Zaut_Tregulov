package jenerics.parameterized_class;

import comparable_and_comporator.comparable.Employee;
import comparable_and_comporator.comparable.People;

public class Test {
    public static void main(String[] args) {
        Class<String, Double> test = new Class<>("Привет", 3.14);
        System.out.println("test.getValue1() = " + test.getValue1());
        System.out.println("test.getValue2() = " + test.getValue2());
        test.setValue1("Пока");
        test.setValue2(test.getValue2() + 10);
        System.out.println("test.toString() = " + test);
        test.info();

        System.out.println("---------------------------------");

        Class<People, Employee> test2 = new Class<>(
                new People("Андрей", "Сургиневич", 23),
                new Employee("Анастасия", "Расюк", 21));
        System.out.println("test2 = " + test2);
        test2.info();
        System.out.println("test2.getValue1() = " + test2.getValue1());
        System.out.println("test2.getValue2() = " + test2.getValue2());
        test2.setValue1(new People("Сергей","Андреев",24));
        System.out.println("test2.toString() = " + test2);
    }

}
