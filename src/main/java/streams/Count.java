package streams;

import java.util.ArrayList;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(5);

        long count = list.size();
        System.out.println(count);
        System.out.println(list.stream().distinct().count());

        List<String> listString = new ArrayList<>();
        listString.add("Привет");
        listString.add("Привет");
        listString.add("меня");
        listString.add("меня");
        listString.add("зовут");
        listString.add("Андрей");
        listString.add("Андрей");

        long countStr = listString.stream().distinct().count();
        System.out.println(countStr);
    }
}
