package nested_classes.anonymous_classes;

public class Test {
    public static void main(String[] args) {
        Math sum = (a, b) -> System.out.println("Сумма = " + (a + b));
        Math difference = (a, b) -> System.out.println("Разность = " + (a - b));
        sum.countUp(4,5);
        difference.countUp(10,3);
    }
}
