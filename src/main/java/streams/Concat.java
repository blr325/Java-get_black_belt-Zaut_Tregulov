package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Concat {
    public static void main(String[] args) {
        ArrayList<String> strings1 = new ArrayList<>();
        ArrayList<String> strings2 = new ArrayList<>();
        strings1.add("Привет");
        strings1.add("Андрей");
        strings2.add("как");
        strings2.add("твои");
        strings2.add("дела?");
        Stream<String> streamString1 = strings1.stream();
        Stream<String> streamString2 = strings2.stream();
        Stream<String> stream = Stream.concat(streamString1, streamString2);
        Stream<String> stream1 = Stream.concat(strings1.stream(),strings2.stream());
        List<String> stringsList = stream.toList();
        List<String> stringsList2 = stream1.toList();

        stringsList.forEach(System.out::println);
        System.out.println("-------------------");
        stringsList2.forEach(System.out::println);
    }

}
