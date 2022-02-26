package collection.array_list;

import java.util.ArrayList;
import java.util.List;

public class Methods4 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("list1 = " + list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Андрей");
        list2.add("Антон");
        list2.add("Артем");
        list2.add("Артур");
        System.out.println("list2 = " + list2);

        List<String> list3 = List.copyOf(list2);
        System.out.println("list3 = " + list3);

        list2.add("Евгений");
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);
    }
}
