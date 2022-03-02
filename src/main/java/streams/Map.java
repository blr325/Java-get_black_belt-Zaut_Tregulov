package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Привет");
        list.add("как дела?");
        list.add("окей");
        list.add("покаю");
        List<Integer> list1 = list.stream().map(String::length).toList();
        Set<Integer> set = list.stream().map(String::length).collect(Collectors.toSet());
        list1.forEach(System.out::println);
        System.out.println("------");
        set.forEach(System.out::println);
    }
}
