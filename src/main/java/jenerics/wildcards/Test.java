package jenerics.wildcards;

import comparable_and_comporator.comparable.People;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Привет");
        stringList.add("как твои");
        stringList.add("дела?");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        List<Float> floatList = new ArrayList<>();
        floatList.add(3.14f);
        floatList.add(4.14f);
        floatList.add(5.14f);
        floatList.add(5.14f);
        List<People> peoples = new ArrayList<>();
        peoples.add(new People("Андрей", "Сургиневич", 23));

        System.out.println("Test.sum(integerList) = " + Test.sum(integerList));
        System.out.println("Test.sum(floatList) = " + Test.sum(floatList));

        Test.printInfo(stringList);
        Test.printInfo(integerList);
        Test.printInfo(floatList);
        Test.printInfo(peoples);

    }

    private static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    private static void printInfo(List<?> list) {
        System.out.println("list = " + list);
    }
}
