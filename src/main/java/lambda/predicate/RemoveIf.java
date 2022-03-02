package lambda.predicate;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Andrei");
        list.add("privet");
        list.add("kak");
        list.add("tvoi");
        list.add("dela?");
        list.forEach(System.out::println);
        System.out.println("--------------");
        list.removeIf((String str) -> str.length() < 5);
        list.forEach(System.out::println);
    }
}
