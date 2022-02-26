package jenerics.parameterized_methods;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>();
        listString.add("Привет");
        listString.add("как");
        listString.add("твои");
        listString.add("дела?");

        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);

        Class.printList(listInt);
        Class.printList(listString);
        System.out.println("Class.getSecondElement(listInt) = " + Class.getSecondElement(listInt));
        System.out.println("Class.getSecondElement(listString) = " + Class.getSecondElement(listString));
    }
}
