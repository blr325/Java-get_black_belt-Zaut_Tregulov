package streams;

import java.util.ArrayList;
import java.util.List;

public class Distinct {
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
        list.stream().distinct().forEach(System.out::println);

        List<String> listString = new ArrayList<>();
        listString.add("Привет");
        listString.add("Привет");
        listString.add("меня");
        listString.add("меня");
        listString.add("зовут");
        listString.add("Андрей");
        listString.add("Андрей");

        listString = listString.stream().distinct().toList();
        listString.forEach(System.out::println);
    }
}
