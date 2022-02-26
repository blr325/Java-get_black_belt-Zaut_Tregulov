package collection.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Methods3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Андрей");
        list.add("Антон");
        list.add("Артем");
        list.add("Артур");

        List<String> list2 = new ArrayList<>();
        list2.add("Андрей");
        list2.add("Дмитрий");
        list2.add("Алексей");
        list2.add("Артур");

        List<String> list3 = new ArrayList<>();
        list3.add("Артем");

        List<String> list4 = list.subList(1,3);
        list4.add("Николай");

        System.out.println("list4 = " + list4);
        System.out.println("list.containsAll(list2) = " + list.containsAll(list2));
        System.out.println("list = " + list);
        list.removeAll(list2);
        System.out.println("list = " + list);
        list.retainAll(list3);
        System.out.println("list = " + list);

        String[] arrayString = list. toArray(new String[0]);
        System.out.println("arrayString = " + Arrays.toString(arrayString));

    }
}
