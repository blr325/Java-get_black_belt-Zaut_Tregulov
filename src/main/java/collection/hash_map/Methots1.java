package collection.hash_map;

import java.util.HashMap;
import java.util.Map;

public class Methots1 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(23, "Андрей");
        hashMap.put(243, "Максим");
        hashMap.put(223, "Алексей");
        hashMap.put(12, "Михаил");
        hashMap.put(67, "Алексей");
        hashMap.put(null, "Артем");
        hashMap.put(null, null);

        System.out.println("hashMap.get(23) = " + hashMap.get(23));
        System.out.println("hashMap.get(343) = " + hashMap.get(343));
        System.out.println("hashMap.get(null) = " + hashMap.get(null));
        System.out.println("hashMap.keySet() = " + hashMap.keySet());
        System.out.println("hashMap.values() = " + hashMap.values());
        System.out.println("hashMap.size() = " + hashMap.size());
        System.out.println("hashMap.remove(null) = " + hashMap.remove(null));
        System.out.println("hashMap.entrySet() = " + hashMap.entrySet());
        hashMap.putIfAbsent(123, "Евгений");
        hashMap.putIfAbsent(243, "Николай");
        System.out.println("hashMap = " + hashMap);

        HashMap<Integer, String> hashMap2 = new HashMap<>(32, 0.9f);
        HashMap<Integer, String> hashMap3 = new HashMap<>(hashMap);
        System.out.println("hashMap2 = " + hashMap2);
        System.out.println("hashMap3 = " + hashMap3);
        hashMap.computeIfPresent(67, (key, value) -> value = "Новое имя - Петр");
        hashMap.computeIfPresent(67, (key, value) -> value = "Новое имя - Петр");
        System.out.println("hashMap.get(67) = " + hashMap.get(67));
        hashMap2.computeIfAbsent(100, (key -> "Настя"));
        System.out.println("hashMap2 = " + hashMap2);
        System.out.println("hashMap3.remove(243,\"Андрей\") = " + hashMap3.remove(243, "Андрей"));
        System.out.println("hashMap3 = " + hashMap3);
        System.out.println("hashMap3.remove(243,\"Максим\") = " + hashMap3.remove(243, "Максим"));
        System.out.println("hashMap3 = " + hashMap3);
    }
}
