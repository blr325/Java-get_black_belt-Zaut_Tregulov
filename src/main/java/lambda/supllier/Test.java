package lambda.supllier;

import java.util.Scanner;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        Supplier<Student> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя студента");
            String name = scanner.nextLine();
            System.out.println("Введите возраст студента");
            int age = scanner.nextInt();
            return new Student(name, age);
        };

        Student student1 = supplier.get();
        Student student2 = supplier.get();
        System.out.println(student1 + "\n" + student2);
    }
}
