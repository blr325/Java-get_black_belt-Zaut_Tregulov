package collection.array_list;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Андрей");
        list.add("Антон");
        list.add("Артем");
        list.add("Артур");
        list.add(2, "Анатолий");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i) = " + list.get(i));
        }
        List<String> list2 = new ArrayList<>(50);
        List<String> list3 = new ArrayList<>(list);
        list3.set(0, "Александр");
        list3.remove(3);
        list3.remove("Артем");
        System.out.println("list 3 = " + list3);
        list2.addAll(list);
        System.out.println("list2 = " + list2);
        list2.addAll(2,list3);
        System.out.println("list2 = " + list2);
        list2.clear();
        System.out.println("list2 = " + list2);
        System.out.println("list3.indexOf(\"Антон\") = " + list3.indexOf("Антон"));
        System.out.println("list3.lastIndexOf(\"Артур\" = " + list3.lastIndexOf("Артур"));
        System.out.println("list3.size() = " + list3.size());
        System.out.println("list2.isEmpty() = " + list2.isEmpty());
        System.out.println("list3.contains(\"Артур\") = " + list3.contains("Артур"));


    }
}
