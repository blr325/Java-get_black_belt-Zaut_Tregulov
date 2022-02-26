package collection.vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("what");
        vector.add("your");
        vector.add("name?");
        vector.add("My");
        vector.add("name");
        vector.add("is");
        vector.add("Andrei.");
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement() + "\n----------------");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----------------");
        ListIterator<String> listIterator = vector.listIterator(vector.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
