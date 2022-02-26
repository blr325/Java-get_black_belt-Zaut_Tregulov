package jenerics.parameterized_methods;

import java.util.Iterator;
import java.util.List;

public class Class {
    public static <T> T getSecondElement(List<T> list) {
        return list.get(1);
    }

    public static <T> void printList(List<T> list) {
        System.out.println(list);
    }
}
