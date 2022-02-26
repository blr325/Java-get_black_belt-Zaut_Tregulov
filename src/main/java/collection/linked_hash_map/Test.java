package collection.linked_hash_map;

import java.util.LinkedHashMap;

public class Test {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>(32,0.8f,true);
        linkedHashMap.put(1,"One");
        linkedHashMap.put(2,"Two");
        linkedHashMap.put(3,"Three");
        linkedHashMap.put(4,"Four");
        linkedHashMap.put(5,"Five");
        System.out.println("linkedHashMap = " + linkedHashMap);
        System.out.println("linkedHashMap.get(3) = " + linkedHashMap.get(3));
        System.out.println("linkedHashMap.get(1) = " + linkedHashMap.get(1));
        System.out.println("linkedHashMap.get(2) = " + linkedHashMap.get(2));
        System.out.println("linkedHashMap.get(4) = " + linkedHashMap.get(4));
        System.out.println("linkedHashMap.get(5) = " + linkedHashMap.get(5));
        System.out.println("linkedHashMap = " + linkedHashMap);

    }
}
