package streams;

import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class Reduce {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(6);
        set.add(3);
        set.add(10);
        set.add(12);
        System.out.println("Список чисел");
        set.forEach(System.out::println);
        System.out.println("Результаты арифметических операций над ними:");
        Optional<Integer> optional = set.stream().reduce(Integer::sum);
        int sum = 0;
        if (optional.isPresent()) sum = optional.get();
        int product = set.stream().reduce(1, (accumulator, element) -> accumulator * element);
        double avrGrade = ((double) set.stream().reduce(Integer::sum).get()) / set.size();
        System.out.println("Сумма = " + sum);
        System.out.println("Произведение = " + product);
        System.out.println("Среднее арифметическое = " + avrGrade);
    }
}