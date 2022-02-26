package collection.hash_table;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Один");
        hashtable.put(2, "Два");
        hashtable.put(3, "Три");
        hashtable.put(4, "Четыре");
        hashtable.put(5, "Пять");
        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + " это " + entry.getValue());
        }
    }
}
