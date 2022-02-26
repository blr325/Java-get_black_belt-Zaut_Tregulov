package collection.hash_code_and_equals;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Andrei", 23);
        Student st2 = new Student("Evgeny", 19);
        Student st3 = new Student("Pavel", 14);
        Student st4 = new Student("Alexander", 22);
        HashMap<Integer, Student> hashMap = new HashMap<>();
        hashMap.put(1, st1);
        hashMap.put(2, st2);
        hashMap.put(3, st3);
        hashMap.put(4, st4);
        for (Map.Entry<Integer, Student> entry : hashMap.entrySet()) {
            System.out.println("Номер " + entry.getKey() + " это " + entry.getValue());
        }
        System.out.println("hashMap.containsValue(st1) = " + hashMap.containsValue(st1));
        System.out.println("hashMap.containsKey(4) = " + hashMap.containsKey(4));
        st1.setAge(24);
        st1.setName("Андрей");
        for (Map.Entry<Integer, Student> entry : hashMap.entrySet()) {
            System.out.println("Номер " + entry.getKey() + " это " + entry.getValue());
        }
        Student st5 = new Student("Andrei", 23);
        System.out.println("hashMap.containsValue(st1) = " + hashMap.containsValue(st1));
        System.out.println("hashMap.containsValue(st5) = " + hashMap.containsValue(st5));
        System.out.println("hashMap.get(1).equals(st1) = " + hashMap.get(1).equals(st1));
        System.out.println("hashMap.get(1).equals(st5) = " + hashMap.get(1).equals(st1));
        System.out.println("hashMap.get(1) == st1 = " + (hashMap.get(1) == st1));
        System.out.println("(hashMap.get(1) == st5) = " + (hashMap.get(1) == st5));

    }
}
